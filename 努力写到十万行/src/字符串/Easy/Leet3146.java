/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/17
 */
public class Leet3146 {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c,i);
        }
        int m = t.length();
        for (int i = 0; i < m; i++) {
           int x = map.get(t.charAt(i)) - i;
           x = x>0?x:-1*x;
           res += x;
        }
        return res;
    }
}
