/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/17
 */
public class Leet2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int n = words.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = new StringBuffer(words[i]).reverse().toString();
            if(list.contains(s)){
                sum++;
                list.remove(list.indexOf(s));
            }else {
                list.add(words[i]);
            }
        }
        return sum;
    }
}
