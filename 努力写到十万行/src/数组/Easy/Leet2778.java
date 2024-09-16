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
public class Leet2778 {
    public int sumOfSquares(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(n%(i+1)==0){
                res += nums[i]*nums[i];
            }
        }
        return res;
    }
}
