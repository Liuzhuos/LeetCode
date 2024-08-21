/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x==0) return -1;
        int res = 0;
        int m = x;
        while (m!=0){
            res += m%10;
            m /= 10;
        }
        if(x%res==0) return res;
        else return -1;
    }
}
