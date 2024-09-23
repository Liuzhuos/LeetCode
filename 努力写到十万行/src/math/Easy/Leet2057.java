/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet2057 {
    public int smallestEqual(int[] nums) {
        int res = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(i%10==nums[i]){
                res = i;
                break;
            }
        }
        return res;
    }
}
