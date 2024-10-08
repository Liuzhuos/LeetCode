/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/7
 */
public class Leet1704 {
    public boolean halvesAreAlike(String s) {
        int a = 0, b =0;
        int n = s.length();
        String sz = "aeiouAEIOU";
        String s1 = s.substring(0,n/2);
        String s2 = s.substring(n/2,n);
        for (char ch :s1.toCharArray()){
            String r = "" + ch;
            if(sz.indexOf(r)>=0){
                a++;
            }
        }
        for (char ch :s2.toCharArray()){
            String r = "" + ch;
            if(sz.indexOf(r)>=0){
                b++;
            }
        }
        return a==b ? true:false;
    }
}
