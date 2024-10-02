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
 * @date 2024/10/2
 */
public class Leet3194 {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double res = Double.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < n/2; i++) {
            res = Math.min(res,(nums[i]+nums[n-i-1])*1.0/2);
        }
        return res;
    }
}
