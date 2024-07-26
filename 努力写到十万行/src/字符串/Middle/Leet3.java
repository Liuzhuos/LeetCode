/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Middle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/26
 */
public class Leet3 {
    public int lengthOfLongestSubstring(String s) {
        int res = Integer.MIN_VALUE;
        int n = s.length();
        int left = 0 , right = 1;
        String sub = "";
        for (int i = 0; i < n; i++) {
            sub = s.substring(left,right);
            if(!isOk(sub)){
                res = Math.max(res,sub.length())-1;
                left ++;
            }else{
                res = Math.max(res,sub.length());
            }
            if(right!=n){
                right ++;
            }else {
                break ;
            }
        }
        if(res == Integer.MIN_VALUE) return n;
        return res;
    }
    public static boolean isOk(String s){
        boolean flag = true;
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))) {
                flag = false;
            }else {
                map.put(s.charAt(i),1);
            }
        }
        return flag;
    }
}
