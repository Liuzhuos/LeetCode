/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for (int i = 0; i < res.length; i++) {
            if(i < n){
                res[2*i] = nums[i];
            }else {
                res[2*(i-n)+1] = nums[i];
            }
        }
        return res;
    }
}
