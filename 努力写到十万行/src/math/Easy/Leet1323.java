/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/30
 */
public class Leet1323 {
    public int maximum69Number (int num) {
        String s = "" + num;
        s.replaceFirst("6","9");
        return Integer.parseInt(s);
    }
}
