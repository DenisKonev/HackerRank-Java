import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
        scan.close();

        for (int i = 1; i < 11; i++)
            System.out.println(integer + " x " + i + " = " +  integer * i);
    }
}