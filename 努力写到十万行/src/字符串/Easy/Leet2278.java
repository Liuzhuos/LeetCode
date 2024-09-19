/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/19
 */
public class Leet2278 {
    public int percentageLetter(String s, char letter) {
        char[] chars = s.toCharArray();
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==letter) x++;
        }
        return  (x * 100) / s.length();
    }
}
