import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++)
            a.add(scan.nextInt());

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            String command = scan.next();
            if (command.equals("Insert"))
                a.add(scan.nextInt(), scan.nextInt());
            else
                a.remove(scan.nextInt());
        }
        scan.close();
        
        for (int elem : a)
            System.out.print(elem + " ");
    }
}