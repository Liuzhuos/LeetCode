/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/26
 */
public class Leet2740 {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            res = Math.min(nums[i+1]-nums[i],res);
        }
        return res;
    }
}
