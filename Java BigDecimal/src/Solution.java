import java.math.BigDecimal;
import java.util.*;

public class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n + 2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            BigDecimal maxValue = new BigDecimal(s[i]);

            for (int j = i + 1; j < n; j++) {
                BigDecimal value = new BigDecimal(s[j]);
                if (maxValue.compareTo(value) < 0) {
                    maxIndex = j;
                    maxValue = value;
                }
            }

            // Swap the found maximum element with the element at index i
            if (maxIndex != i) {
                String temp = s[i];
                s[i] = s[maxIndex];
                s[maxIndex] = temp;
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}