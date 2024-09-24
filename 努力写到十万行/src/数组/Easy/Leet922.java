/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/24
 */
public class Leet922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0,o = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]&1)==1){
                res[j*2+1] = nums[i];
                j++;
            }else {
                res[o*2] = nums[i];
                o++;
            }
        }
        return res;
    }
}
