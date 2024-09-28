/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/28
 */
public class Leet2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String s = "" + x ;
            if(words[i].indexOf(s)>=0){
                list.add(i);
            }
        }
        return list;
    }
}
