import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstInt = scanner.nextBigInteger();
        BigInteger secondInt = scanner.nextBigInteger();
        scanner.close();

        System.out.println(firstInt.add(secondInt));
        System.out.println(firstInt.multiply(secondInt));
    }
}