import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean isAnagram(String a, String b) {
        char[] firstArray = a.toLowerCase().toCharArray();
        char[] secondArray = b.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

       if (Arrays.compare(firstArray, secondArray) == 0)
           return true;
       else
           return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}