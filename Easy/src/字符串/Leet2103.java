/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/2
 */
public class Leet2103 {
    public int countPoints(String rings) {
        int res = 0;
        int n = rings.length()/2;
        String[] arr = new String[10];
        for (int i = 0; i < n; i++) {
            int m = rings.charAt(i*2+1) - '0';
            arr[m] = arr[m] + rings.charAt(i*2);
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i]!=null) {
                if (arr[i].contains("R") && arr[i].contains("G") && arr[i].contains("B")) {
                    res++;
                }
            }
        }
        return res;
    }
}
