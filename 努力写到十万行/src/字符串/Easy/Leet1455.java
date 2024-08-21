/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res = -1;
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].indexOf(searchWord)==0) {
                res = i;
                break;
            }
        }
        if(res > -1) return res +1;
        else return res;
    }
}
