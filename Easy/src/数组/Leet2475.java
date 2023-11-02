/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/1
 */
public class Leet2475 {
    public int unequalTriplets(int[] nums) {
        int n =  nums.length;
        int res = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(nums[i]!=nums[j]&&nums[i]!= nums[k]&&nums[j]!= nums[k])
                        res++;
                }
            }
        }
        return res;
    }
}

