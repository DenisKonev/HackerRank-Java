import java.util.Scanner;

public class Solution {
     class Inner {
         private class Private {
            public boolean powerOf2(int num) {
                return (int)(Math.ceil((Math.log(num) / Math.log(2)))) == (int)(Math.floor(((Math.log(num) / Math.log(2)))));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        Solution solution = new Solution();
        Solution.Inner inner = solution.new Inner();
        Solution.Inner.Private instance = inner.new Private();

        if (instance.powerOf2(num))
            System.out.println(num + " is power of 2");
        else
            System.out.println(num + " is not a power of 2");

        System.out.println("An instance of class: " + instance.getClass().getName().replace('$', '.') + " has been created");
    }
}