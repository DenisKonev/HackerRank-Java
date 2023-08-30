import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        String resultYesNo = "", resultCapital = "";

        System.out.println(input1.length() + input2.length());

        if (input1.compareTo(input2) > 0)
            resultYesNo = "Yes";
        else
            resultYesNo = "No";
        System.out.println(resultYesNo);

        resultCapital += input1.substring(0,1).toUpperCase() + input1.substring(1) + " " + input2.substring(0,1).toUpperCase() + input2.substring(1);
        System.out.println(resultCapital);
    }
}



