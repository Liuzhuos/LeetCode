/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 贪心.Easy;


import java.util.Arrays;
import java.util.Collections;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0 ;
        for (int x : apple){
            sum += x ;
        }
        Arrays.sort(capacity);
        int n = capacity.length;
        int res = 0;
        int sm = 0;
        for (int i = n-1; i >=0 ; i--) {
            sm += capacity[i];
            res++;
            if(sm>=sum){
                break;
            }
        }
        return res;
    }
}
