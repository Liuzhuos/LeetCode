/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/26
 */
public class Leet2520 {
    public int countDigits(int num) {
        int res = 0;
        int n = num;
        String s = num + "";
        for (int i = 0; i < s.length(); i++) {
            int a = num%10;
            num = num/10;
            if(n%a==0) res++;
        }
        return res;
    }
}
