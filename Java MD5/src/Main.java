import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        try{
            MessageDigest MD5= MessageDigest.getInstance("MD5");
            byte[] inputByte= input.getBytes();
            byte[] hashByte = MD5.digest(inputByte);
            StringBuilder hexString = new StringBuilder();
            for(byte hashBytes:hashByte){
                // String hex= Integer.toHexString(0xFF & hashByte);
                String hex= Integer.toHexString(0xFF & hashBytes);

                if(hex.length()==1){
                    hexString.append("0");
                }
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
