/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet2710 {
    public String removeTrailingZeros(String num) {
        int n = num.length()-1;
        int k = 0;
        for (int i = n; i >= 0 ; i--) {
            if(num.charAt(i)=='0') k++;
            else break;
        }
        String s = "";
        for (int i = 0; i <= n-k; i++) {
            s += num.charAt(i);
        }
        return s;
    }
}
