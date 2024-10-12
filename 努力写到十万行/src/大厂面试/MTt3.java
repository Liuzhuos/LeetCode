/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/11
 */
public class MTt3 {
    //获取最小正整数
    public static int solve(int[] arr){
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (res<arr[i]){
                return res;
            }else {
                res = arr[i]+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-->0){
            int res = Integer.MAX_VALUE;
            int n = scan.nextInt();
            int k = scan.nextInt();
            int x = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i <= n; i++) {
                res = Math.min(res,x*i + k*solve(Arrays.copyOfRange(arr,i,n)));
            }
            System.out.println(res);
        }
    }
}
