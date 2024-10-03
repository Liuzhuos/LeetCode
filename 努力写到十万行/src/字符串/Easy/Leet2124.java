/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet2124 {
    public boolean checkString(String s) {
        int x = s.indexOf("b");
        if (x==-1) return true;
        boolean isOk = true;
        for (int i = x; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                isOk = false;
                break;
            }
        }
        return isOk;
    }
}
