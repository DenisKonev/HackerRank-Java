import java.util.Scanner;

class Main{

    static class MyRegex {
        MyRegex() {
            pattern = "^(([0-9]|0[0-9]|00[0-9]|[1-9][0-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
            /*
            # Explanation
(
  [0-9]         # 0-9
  |             # or
  [1-9][0-9]    # 10-99
  |             # or
  1[0-9][0-9]   # 100-199
  |             # or
  2[0-4][0-9]   # 200-249
  |             # or
  25[0-5]       # 250-255

  and etc
)
(\.(?!$)|$))    # ensure IPv4 doesn't end with a dot
{4}             # 4 times.
             */
        }
        String pattern;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}