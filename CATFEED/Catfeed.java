//Question Link : https://www.codechef.com/problems/CATFEED

package codechef;

import java.util.*;

public class Catfeed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int min = 0, flag = 0;
            Integer[] nums = new Integer[n];
            for (int i = 0; i < n; i++) {
                nums[i] = 0;
            }
            for (int i = 0; i < m; i++) {
                int ind = s.nextInt();
                nums[ind - 1]++;
                if (nums[ind - 1] - min > 1 && flag == 0) {
                    System.out.println("NO");
                    flag++;
//                    break;
                }
                min = Collections.min(Arrays.asList(nums));
            }
            if (flag == 0) {
                System.out.println("YES");
            }
        }
    }
}
