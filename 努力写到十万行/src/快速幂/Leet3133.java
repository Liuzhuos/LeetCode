/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/22
 */
public class Leet3133 {
    public long minEnd(int n, int x) {
        String s = "";
        char[] chars = Integer.toBinaryString(n - 1).toCharArray();
        int i = chars.length-1;
        while (x!=0 && i>0){
            if((x&1)==1){
                s = "1" + s;
            }else if(i>=0){
                s = chars[i--] + s;
            }else {
                s= "0" + s;
            }
            x >>= 1;
        }
        if(s.equals(""))return 0;
        return Long.parseLong(s,2);
    }
}
