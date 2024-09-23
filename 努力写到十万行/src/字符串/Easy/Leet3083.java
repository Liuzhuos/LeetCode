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
 * @date 2024/9/23
 */
public class Leet3083 {
    public boolean isSubstringPresent(String s) {
        boolean isOk = false;
        Set<String> set = new HashSet<>();
        int n = s.length();
        String s1 = "";
        for (int i = 0; i < n-1; i++) {
            s1 = s.substring(i,i+2);
            set.add(s1);
        }
        for (int i = n-1; i > 0 ; i--) {
            s1 = "" + s.charAt(i) + s.charAt(i-1);
            if (set.contains(s1)) {
                isOk = true;
                break;
            }
        }
        return isOk;
    }
}
