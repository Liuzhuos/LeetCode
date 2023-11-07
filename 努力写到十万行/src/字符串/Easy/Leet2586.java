/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/7
 */
public class Leet2586 {
    public int vowelStrings(String[] words, int left, int right) {
        String s = "aeiou";
        int res = 0;
        for (int i = left; i <= right; i++) {
            String cleft = "" + words[i].charAt(0);
            String cright = "" + words[i].charAt(words[i].length()-1);
            if(s.contains(cleft)&&s.contains(cright)) res++;
        }
        return res;
    }
}
