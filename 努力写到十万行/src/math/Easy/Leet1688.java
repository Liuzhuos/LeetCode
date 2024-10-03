/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet1688 {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n>1){
            if((n&1)==0){
                n /= 2;
                res += n;
            }else {
                n = (n-1)/2;
                res += n;
                n++;
            }
        }
        return res;
    }
}
