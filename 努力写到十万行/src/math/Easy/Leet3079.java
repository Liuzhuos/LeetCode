/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/30
 */
public class Leet3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int res = 0;
        for (int num:nums){
            int max = 0;
            String s = "" + num;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                int x = s.charAt(i)-'0';
                max = Math.max(max,x);
            }
            s = "";
            while (n-->0){
                s += max;
            }
            res += Integer.parseInt(s);
        }
        return res;
    }
}
