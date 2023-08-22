import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        scanner.close();

        Main.calculateResult(input);
    }

    private static void calculateResult(double input) {
        NumberFormat USCurFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat IndiaCurFormat = NumberFormat.getCurrencyInstance(new Locale("hi", "IN"));
        NumberFormat ChinaCurFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FranceCurFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + USCurFormat.format(input));
        System.out.println("India: " + IndiaCurFormat.format(input));
        System.out.println("China: " + ChinaCurFormat.format(input));
        System.out.println("France: " + FranceCurFormat.format(input));
    }
}