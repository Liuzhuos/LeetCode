/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/16
 */
public class Leet3065 {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<k) sum++;
        }
        return sum;
    }
}
