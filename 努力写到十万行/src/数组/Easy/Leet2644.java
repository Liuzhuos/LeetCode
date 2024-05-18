/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/5/18
 */
public class Leet2644 {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);
        int sum = 0;
        int max = 0;
        int k = 0;
        for (int i = 0; i < divisors.length; i++) {
            sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]%divisors[i]==0) sum++;
            }
            if (max<sum) {
                max = sum;
                k = i;
            }
        }
        return divisors[k];
    }
}
