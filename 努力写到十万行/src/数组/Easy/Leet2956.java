/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.HashSet;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/20
 */
public class Leet2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int x : nums1) {
            s1.add(x);
        }
        HashSet<Integer> s2 = new HashSet<>();
        for (int x : nums2) {
            s2.add(x);
        }

        int[] res = new int[2];
        for (int x : nums1) {
            if (s2.contains(x)) {
                res[0]++;
            }
        }
        for (int x : nums2) {
            if (s1.contains(x)) {
                res[1]++;
            }
        }
        return res;
    }
}
