/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/27
 */
public class Leet1645 {
    static int MOD = 100000007;
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int) ((long) maxSum(h,horizontalCuts) * maxSum(w,verticalCuts) % MOD);
    }
    public static int maxSum(int x,int[] arr){
        int[] res = new int[arr.length+2];
        res[0] = 0;res[1] = x;
        int max = 0;
        for (int i = 2; i < res.length; i++) {
            res[i] = arr[i-2];
        }
        Arrays.sort(res);
        for (int i = 1; i < res.length; i++) {
            max = Math.max(max,res[i]-res[i-1]);
        }
        return max;
    }
}
