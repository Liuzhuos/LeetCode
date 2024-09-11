/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/11
 */
public class Leet3184 {
    public int countCompleteDayPairs(int[] hours) {
        int res = 0;
        for (int i = 0; i < hours.length-1; i++) {
            for (int j = i+1; j < hours.length; j++) {
                if((hours[i]+hours[j])%24==0) res ++;
            }
        }
        return res;
    }
}
