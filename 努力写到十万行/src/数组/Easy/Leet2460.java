/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/31
 */
public class Leet2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]) {
                nums[i] *= 2 ;
                nums[i+1] = 0;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0,k=0; i < res.length; i++) {
            if(nums[i]!=0){
                res[k] = nums[i];
                k++;
            }
        }
        return res;
    }
}
