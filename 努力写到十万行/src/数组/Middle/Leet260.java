/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

import java.util.*;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/16
 */
public class Leet260 {
        public static int[] singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
            int[] ans = new int[2];
            int idx = 0;
            for (int i : nums) {
                if (map.get(i) == 1) ans[idx++] = i;
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,4};
        int[] arr = singleNumber(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
