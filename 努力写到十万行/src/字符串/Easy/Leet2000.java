/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet2000 {
    public String reversePrefix(String word, char ch) {
        int x = word.indexOf(ch);
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            if(i<=x){
                s += word.charAt(x-i);
            }else {
                s += word.charAt(i);
            }
        }
        return s;
    }
}
