/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组;

import java.util.*;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/31
 */
public class Leet2465 {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0 , j = nums.length-1; i < j ; i++,j--) {
            set.add(nums[i]+nums[j]);
        }
        return set.size();
    }
}
