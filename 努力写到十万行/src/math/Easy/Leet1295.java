/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/11
 */
public class Leet1295 {
    public int findNumbers(int[] nums) {
        int res = 0;
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s = "" + nums[i];
            if((s.length()&1)==0) res++;
        }
        return res;
    }
}
