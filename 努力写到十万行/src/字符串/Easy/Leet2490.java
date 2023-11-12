/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/12
 */
public class Leet2490 {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        boolean isok = true;
        for (int i = 0; i < s.length-1; i++) {
            if(s[i].charAt(s[i].length()-1)!=s[i+1].charAt(0)){
                isok = false;
            }
        }
        if(s[0].charAt(0)!=s[s.length-1].charAt(s[s.length-1].length()-1)) isok = false;
        return isok;
    }
}
