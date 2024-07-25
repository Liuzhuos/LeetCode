/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/25
 */
public class Leet2105 {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int res = 0;
        int n = plants.length;
        int i = 0 , j = n - 1;
        int A = capacityA,B = capacityB;
        while (i<j){
            if(A<plants[i]){
                res++;
                A = capacityA;
            }
            A -= plants[i];
            i++;
            if(B<plants[j]){
                res++;
                B = capacityB;
            }
            B -= plants[j];
            j--;
        }
        if(i == j){
            if(Math.max(A,B)<plants[i]) res++;
        }
        return res;
    }
}
