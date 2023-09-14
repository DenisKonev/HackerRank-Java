import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(), uniquePairsCount = 0;
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        String [] pairsArray = new String[t];
        Set<String> pairsSet = new HashSet<>();

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            String pair = pair_left[i] + " " +  pair_right[i];
            pairsSet.add(pair);
            pairsArray[i] = pair;
        }

        for (String entry : pairsArray) {
            if (pairsSet.contains(entry)) {
                pairsSet.remove(entry);
                uniquePairsCount++;
            }
            System.out.println(uniquePairsCount);
        }
    }
}