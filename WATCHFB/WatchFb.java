package codechef;

// Ques link : https://www.codechef.com/LTIME76B/problems/WATCHFB/

import java.util.*;

public class WatchFb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            boolean prev = false;
            long max = 0;
            while (n-- > 0){
                int reply = s.nextInt();
                long A = s.nextLong();
                long B = s.nextLong();

                if(reply == 1){
                    System.out.println("YES");
                    prev = true;
                }else if(A == B){
                    System.out.println("YES");
                }else if(prev){
                    long min = Math.min(A,B);
                    if(min < max){
                        System.out.println("YES");
                        prev = true;
                    }else {
                        prev = false;
                        System.out.println("NO");
                    }
                }else {
                    System.out.println("NO");
                }
                max = Math.max(A,B);
            }
        }
    }
}
