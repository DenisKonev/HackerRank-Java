import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        scan.close();

        System.out.println(countSubArrays(a));
   }

    private static int countSubArrays(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length + 1; j++) {
                int sum = 0;
                int[] subArray = Arrays.copyOfRange(array, i, j);
                for (int elem : subArray)
                    sum += elem;
                if (sum < 0)
                    count++;
            }
        return count;
    }
}
