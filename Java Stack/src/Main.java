import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(evaluateInput(input));
        }
    }

    private static boolean evaluateInput(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> inputStack = new Stack<Character>();
        //Array represent number of each bracket: [0] is for (), [1] is for {} & [2] is for []. Positive number represents opening bracket, negative closing one.
        int[] bracketsCountArray = new int[3];
        boolean isValidString = true;

        for (char entry : inputArray)
            inputStack.push(entry);

        while (!inputStack.empty()) {
            char currentChar = inputStack.pop();
            switch (currentChar) {
                case '(': bracketsCountArray[0]++;
                    break;
                case ')': bracketsCountArray[0]--;
                    break;
                case '{': bracketsCountArray[1]++;
                    break;
                case '}': bracketsCountArray[1]--;
                    break;
                case '[': bracketsCountArray[2]++;
                    break;
                case ']': bracketsCountArray[2]--;
                    break;
            }
            //positive number meaning that there is an opening bracket before the closing one making the whole string invalid.
            for (int entry : bracketsCountArray)
                if (entry > 0) {
                    isValidString = false;
                    break;
                }
        }
        for (int entry : bracketsCountArray)
            if (entry != 0) {
                isValidString = false;
                break;
            }
        return isValidString;
    }
}
