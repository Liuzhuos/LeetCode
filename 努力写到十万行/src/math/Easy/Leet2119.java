/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/29
 */
public class Leet2119 {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        String s = "" + num;
        if(s.charAt(s.length()-1)!='0') return true;
        else return false;
    }
}
