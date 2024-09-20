/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet1342 {
    public int numberOfSteps(int num) {
        if(num==0) return  0;
        int res =0;
        while (num!=0){
            if((num&1)==1){
                res++;
            }
            num = num>>1;
            res++;
        }
        return res-1;
    }
}
