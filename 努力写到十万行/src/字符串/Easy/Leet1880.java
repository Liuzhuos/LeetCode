/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/29
 */
public class Leet1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        if(string2sum(firstWord)+string2sum(secondWord)==string2sum(targetWord)) return true;
        else return false;
    }
    public static int string2sum(String s){
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i)-'a';
            s1 += x;
        }
        return Integer.parseInt(s1);
    }
}
