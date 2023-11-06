/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/6
 */
public class Leet318 {
    public int maxProduct(String[] words) {
        int max = 0; //默认值，返回0
        int n = words.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String s = words[i];
            int m = s.length();
            for (int j = 0; j < m; j++) {
                arr[i] |= 1 << (s.charAt(j)-'a');
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]&arr[j])==0){
                    max = Math.max(max,words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
