/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 动态规划.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/28
 */
public class Leet2735 {
    public long minCost(int[] nums, int x) {
        int n = nums.length;
        int[] f = new int[n];
        System.arraycopy(nums, 0, f, 0, n);
        long ans = getSum(f);
        for (int k = 1; k < n; ++k) {
            for (int i = 0; i < n; ++i) {
                f[i] = Math.min(f[i], nums[(i + k) % n]);
            }
            ans = Math.min(ans, (long) k * x + getSum(f));
        }
        return ans;
    }

    public long getSum(int[] f) {
        long sum = 0;
        for (int num : f) {
            sum += num;
        }
        return sum;
    }
}
