/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/26
 */
public class Leet2535 {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int num = 0;
        for(int x : nums){
            sum += x;
            while (x>0){
                num += x%10;
                x /= 10;
            }
        }
        return sum-num;
    }
}
