/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/11
 */
public class Leet2485 {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        if(n==2) return -1;
        int sum = n*(n+1)/2;
        int res = 0;
        int i= 1;
        for (; i <= n; i++) {
            res += i;
            if((sum+i)%2!=0) continue;
            if(res*2 >= sum+i){
                break;
            }
        }
        if(res*2==sum+i) return i ;
        else return -1;
    }
}
