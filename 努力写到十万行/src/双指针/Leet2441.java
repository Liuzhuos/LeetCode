/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet2441 {
    public int findMaxK(int[] nums) {
        int left = 0,right = nums.length-1;
        Arrays.sort(nums);
        int res = -1;
        while (left<right){
            if(nums[left]+nums[right]>0){
                right--;
            }else if (nums[left]+nums[right]<0){
                left++;
            }else {
                res = nums[right];
                break;
            }
        }
        return res;
    }
}
