/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Diff;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet2376 {
    public int countSpecialNumbers(int n) {
        String s = Integer.toString(n);
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            ans += 9 * permutationCount(9, i - 1);
        }
        int set = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            for (int j = (i == 0 ? 1 : 0); j < num; j++) {
                if ((set & (1 << j)) == 0) {
                    ans += permutationCount(10 - (i + 1), s.length() - (i + 1));
                }
            }
            if ((set & (1 << num)) != 0) {
                break;
            }
            set |= 1 << num;
        }
        if (Integer.bitCount(set) == s.length()) {
            ans++;
        }
        return ans;
    }

    public static int permutationCount(int n, int m) {
        int permutationCount = 1;
        for (int i = n; i > n - m; i--) {
            permutationCount *= i;
        }
        return permutationCount;
    }
}
