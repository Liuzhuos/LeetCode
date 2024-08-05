/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/5
 */
public class Leet600 {
    public int findIntegers(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if(!isOk(i)) res++;
        }
        return res;
    }
    public static boolean isOk(int n){
        boolean flag = false;
        while (n>=0){
            if((n&1)==1){
                n>>=1;
                if((n&1)==1){
                    flag = true;
                    n>>=1;
                }
            }else n>>=1;
        }
        return flag;
    }
}
