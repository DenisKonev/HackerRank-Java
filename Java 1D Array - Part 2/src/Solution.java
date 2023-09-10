import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution
{
    public static boolean solve(int n, int leap, ArrayList<Integer> arr)
    {
        Stack<Integer> st=new Stack<>(); //substitute recursion with a stack
        st.push(0);
        while(!st.empty())
        {
            int i=st.pop();
            //stop function from evaluating this cell a second time
            arr.set(i, -1);
            //check if win condition
            if (i+leap >= arr.size() || i+1>=arr.size())
                return true;
            //check if you can go backwards
            if (i>0 && arr.get(i-1)==0)
                st.push(i-1);
            //check if you can go forwards
            if (arr.get(i+1)==0)
                st.push(i+1);
            //check if you can leap
            if (arr.get(i+leap)==0)
                st.push(i+leap);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(), leap=sc.nextInt();
            for(int j=0;j<n;j++)
                arr.add(sc.nextInt());
            if(solve(n, leap, arr))
                System.out.println("YES");
            else
                System.out.println("NO");
            arr.clear();
        }
    }
}