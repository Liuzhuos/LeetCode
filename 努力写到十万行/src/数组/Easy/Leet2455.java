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
public class Leet2455 {
    public int averageValue(int[] nums) {
        int k = 0;
        int sum = 0;
        for(int x : nums){
            if((x&1)==0&&x%3==0){
                k++;
                sum += x;
            }
        }
        if(k==0) return 0;
        return sum/k;
    }
}
