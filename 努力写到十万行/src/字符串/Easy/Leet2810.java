/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/30
 */
public class Leet2810 {
    public String finalString(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='i'){
                s1 = new StringBuilder(s1).reverse().toString();
            }else {
                s1 += s.charAt(i);
            }
        }
        return s1;
    }
}
