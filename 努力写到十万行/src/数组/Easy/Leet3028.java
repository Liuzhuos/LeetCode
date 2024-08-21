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
public class Leet3028 {
    public int returnToBoundaryCount(int[] nums) {
        int num = 0;
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1] + nums[i];
            if (res[i]==0){
                num++;
            }
        }
        return num;
    }
}
