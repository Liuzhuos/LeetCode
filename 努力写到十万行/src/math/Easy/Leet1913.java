/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/11
 */
public class Leet1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-1]*nums[n-2] - nums[0]*nums[1];
    }
}
