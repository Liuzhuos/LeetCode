/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/22
 */
public class Leet2185 {
    public int prefixCount(String[] words, String pref) {
        int  res = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if(words[i].indexOf(pref)==0) res++;
            
        }
        return res;
    }
}
