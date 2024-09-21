/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet1832 {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        int n = sentence.length();
        for (int i = 0; i < n; i++) {
            set.add(sentence.charAt(i));
        }
        if(set.size()==26) return true;
        else return false;
    }
}
