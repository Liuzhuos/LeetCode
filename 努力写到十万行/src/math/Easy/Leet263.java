/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/24
 */
public class Leet263 {
    public boolean isUgly(int n) {
        if(n==0) return false;
        while(n%2==0){
            n = n/2;
        }
        while(n%3==0){
            n = n/3;
        }
        while(n%5==0){
            n = n/5;
        }
        if(n==1) return true;
        else return false;
    }
}
