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
public class Leet2351 {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        char res = '0';
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                 res = s.charAt(i);
                 break;
            }
        }
        return res;
    }
}
