/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/4
 */
public class Leet421 {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        if(n<2) return 0;
        int k = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                k = nums[i] ^ nums[j];
                max = Math.max(max,k);
            }
        }
        return max;
    }
}
