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
 * @date 2024/8/21
 */
public class Leet1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max((nums[0]-1)*(nums[1]-1),(nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}
