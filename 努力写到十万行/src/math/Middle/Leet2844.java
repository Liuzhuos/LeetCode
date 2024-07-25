/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

import java.time.chrono.MinguoChronology;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/25
 */
public class Leet2844 {
    public int minimumOperations(String num) {
        if(num.equals("0")) return 0;
        int res_00 = Integer.MAX_VALUE;
        int res_25 = Integer.MAX_VALUE;
        int res_50 = Integer.MAX_VALUE;
        int res_75 = Integer.MAX_VALUE;
        int res_x0 = Integer.MAX_VALUE;
        int n = num.length();
        for (int i = n-1; i >=0; i--) {
            if(num.charAt(i)=='0'){
                for (int j = i-1; j >=0 ; j--) {
                    if (res_00 == Integer.MAX_VALUE && num.charAt(j)=='0'){
                        res_00 = n-j - 2;
                        break ;
                    }
                    if (res_50 == Integer.MAX_VALUE &&num.charAt(j)=='5'){
                        res_50 = n-j-2;
                        break ;
                    }
                    if(j==0) res_x0 = n-1;
                }
            }
            if (num.charAt(i)=='5'){
                for (int j = i-1; j >=0 ; j--) {
                    if (res_25 == Integer.MAX_VALUE &&num.charAt(j)=='2'){
                        res_25 = n-j-2;
                        break ;
                    }
                    if (res_75 == Integer.MAX_VALUE &&num.charAt(j)=='7'){
                        res_75 = n-j-2;
                        break ;
                    }
                }
            }
        }
        int res = Math.min(res_00,res_25);
        res = Math.min(res,res_50);
        res = Math.min(res,res_75);
        res = Math.min(res,res_x0);
        if(res==Integer.MAX_VALUE) return n;
        return res;
    }
}
