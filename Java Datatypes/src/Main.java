import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int queriesNumber = Integer.parseInt(bufferedReader.readLine().trim());
        List<BigInteger> result = new ArrayList<>();

        for (int i = 0; i < queriesNumber; i++) {
                BigInteger currentValue = new BigInteger(bufferedReader.readLine());

                result.add(currentValue);
        }

            bufferedReader.close();

        for(BigInteger elem : result)
            Main.doesItFit(elem);
    }

    private static void doesItFit(BigInteger elem) {
        boolean byteFits = true, shortFits = true, intFits = true, longFits = true;

        try {
            byte bigIntAsByte = elem.byteValueExact();
        } catch (ArithmeticException e) {
            byteFits = false;
        }

        try {
            short bigIntAsShort = elem.shortValueExact();
        } catch (ArithmeticException e) {
            shortFits = false;
        }

        try {
            int bigIntAsInt = elem.intValueExact();
        } catch (ArithmeticException e) {
            intFits = false;
        }

        try {
            long bigIntAsLong = elem.longValueExact();
        } catch (ArithmeticException e) {
            longFits = false;
        }

        Main.printResult(elem, byteFits, shortFits, intFits, longFits);
    }

    private static void printResult(BigInteger elem, boolean byteFits, boolean shortFits, boolean intFits, boolean longFits) {
        if (byteFits || shortFits || intFits || longFits) {
            System.out.println(elem + " can be fitted in:");
            if (byteFits)
                System.out.println("* byte");
            if (shortFits)
                System.out.println("* short");
            if (intFits)
                System.out.println("* int");
            if (longFits)
                System.out.println("* long");
        }

        else
            System.out.println(elem + " can't be fitted anywhere.");
    }
}