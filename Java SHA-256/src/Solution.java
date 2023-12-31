import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringToHash = sc.nextLine();

        try {
            System.out.println(GenerateHash(stringToHash));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String GenerateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(16);

        // pad with 0 if the hexa digits are less then 64.
        while (strHashCode.length() < 64) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }
}