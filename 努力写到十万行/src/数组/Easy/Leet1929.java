/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/22
 */
public class Leet1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n*2];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i] ;
            res[i+n] = nums[i];
        }
        return res;
    }
}
