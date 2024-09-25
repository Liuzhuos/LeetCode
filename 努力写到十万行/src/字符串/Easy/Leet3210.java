/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/24
 */
public class Leet3210 {
    public String getEncryptedString(String s, int k) {
        if(s.length()<=k){
            k = k % s.length();
        }
        return "" + s.substring(k) + s.substring(0,k);
    }
}
