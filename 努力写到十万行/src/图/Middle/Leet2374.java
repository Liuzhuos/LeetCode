/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 图.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/21
 */
public class Leet2374 {
    public int edgeScore(int[] edges) {
        int res = 0;
        int ans = 0;
        int n = edges.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[edges[i]] += i;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>res){
                res = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
