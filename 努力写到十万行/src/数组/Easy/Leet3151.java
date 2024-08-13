/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/13
 */
public class Leet3151 {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        boolean isOk = true;
        for (int i = 1; i < n; i++) {
            if(((nums[i-1]^nums[i])&1)!=1){
                isOk = false;
                break;
            }
        }
        return isOk;
    }
}
