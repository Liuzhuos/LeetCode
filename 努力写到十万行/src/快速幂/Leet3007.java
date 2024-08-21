/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet3007 {
    public long findMaximumNumber(long k, int x) {
        long res = 0;
        long m = 1;
        while (res<=k){
            long i = m;
            i=i>>(x-1);
            if((i&1)==1) {
                res++;
            }
            while (true){
                i=i>>x;
                if(i==0) break;
                if((i&1)==1) {
                    res++;
                }
            }
            m++;
        }
        return m-2;
    }
}
