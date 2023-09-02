import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args){
/*
<([^<>/]+)> to match HTML start tag. The parentheses is to put the content into a group. In the example, it is h1. [^<>/] means we don't want to have any of those characters <, >, /.
([^<>]+) to match the content between 2 tags
to match HTML end tag. (\1) to match the same content as in the first group. In the example, it is h1
Example:
<h1>Nayeem loves counseling</h1>
 */
        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String line = in.nextLine();

            Matcher m = r.matcher(line);
            boolean findMatch = true;
            while(m.find()){
                System.out.println(m.group(2));
                findMatch = false;
            }
            if(findMatch) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}