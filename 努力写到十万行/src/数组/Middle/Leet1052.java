/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/4/23
 */
public class Leet1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <= grumpy.length-minutes; i++) {
            sum = 0;
            for (int j = 0; j < grumpy.length; j++) {
                if(j>=i&&j<i+minutes){
                    sum += customers[j];
                }else {
                    if(grumpy[j]==0){
                        sum += customers[j];
                    }
                }
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
