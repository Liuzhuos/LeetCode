/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/31
 */
public class Leet172 {
    public int trailingZeroes(int n) {
        int num_2 = 0;
        int num_5 = 0;
        for (int j = n; j >= 0; j--) {
            int i = j;
            while (i%2==0 || i%5==0){
                if(i%2==0){
                    num_2 ++;
                    i /= 2;
                }
                if(i%5==0){
                    num_5 ++;
                    i /= 5;
                }
            }
        }
        return Math.min(num_2,num_5);
    }
}
