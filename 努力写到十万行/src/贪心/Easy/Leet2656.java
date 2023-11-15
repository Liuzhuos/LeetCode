/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 贪心.Easy;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/15
 */
public class Leet2656 {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int m = nums[nums.length-1];
        return (m + m + k-1)*k/2;
    }
}
