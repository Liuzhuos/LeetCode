/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/7
 */
public class Leet2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(left-sum+nums[i]+left);
            left += nums[i];
        }
        return res;
    }
}
