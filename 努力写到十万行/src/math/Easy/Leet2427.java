/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet2427 {
    public int commonFactors(int a, int b) {
        int k = gcd(a, b), ans = 0;
        for (int i = 1; i * i <= k; i++) {
            if (k % i == 0) {
                ans++;
                if (i * i < k) ans++;
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
