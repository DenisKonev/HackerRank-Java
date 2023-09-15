import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitSetSize = scanner.nextInt(), numberOfQueries = scanner.nextInt();
        BitSet firstBitSet = new BitSet(bitSetSize), secondBitSet = new BitSet(bitSetSize);

        for (int i = 0; i < numberOfQueries; i++) {
            String command = scanner.next();
            int firstParameter = scanner.nextInt();
            int secondParameter = scanner.nextInt();
            System.out.println(processData(firstBitSet, secondBitSet, command, firstParameter, secondParameter ));
        }
        scanner.close();
    }

    private static String processData(BitSet firstBitSet, BitSet secondBitSet, String command, int firstParameter, int secondParameter) {
        switch (command) {
            case "AND":
                if (firstParameter == 1)
                    firstBitSet.and(secondBitSet);
                else
                    secondBitSet.and(firstBitSet);
                break;

            case "OR":
                if (firstParameter == 1)
                    firstBitSet.or(secondBitSet);
                else
                    secondBitSet.or(firstBitSet);
                break;

            case "XOR":
                if (firstParameter == 1)
                    firstBitSet.xor(secondBitSet);
                else
                    secondBitSet.xor(firstBitSet);
                break;

            case "FLIP":
                if (firstParameter == 1)
                    firstBitSet.flip(secondParameter);
                else
                    secondBitSet.flip(secondParameter);
                break;

            case "SET":
                if (firstParameter == 1)
                    firstBitSet.set(secondParameter, true);
                else
                    secondBitSet.set(secondParameter, true);
                break;
        }
        return firstBitSet.cardinality() + " " + secondBitSet.cardinality();
    }
}