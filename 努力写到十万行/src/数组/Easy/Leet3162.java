/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(nums1[i]%(nums2[j]*k)==0) res++;
            }
        }
        return res;
    }
}
