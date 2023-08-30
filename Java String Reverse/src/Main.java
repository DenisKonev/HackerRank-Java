import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        System.out.println(isPalindrome(input));
    }

    private static String isPalindrome(String input) {
        StringBuilder string = new StringBuilder(input);
        StringBuilder reverse = new StringBuilder(input);

        reverse.reverse();

        if (string.compareTo(reverse) == 0)
            return "Yes";
        else
            return "No";
    }
}



