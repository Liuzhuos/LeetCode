/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/16
 */
public class Leet2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length, ans = 0, i = 0;
        while (i < n) {
            if ((nums[i] % 2 != 0 || nums[i] > threshold) && ++i >= 0) continue;
            int j = i + 1, cur = nums[i] % 2;
            while (j < n) {
                if (nums[j] > threshold || nums[j] % 2 == cur) break;
                cur = nums[j++] % 2;
            }
            ans = Math.max(ans, j - i);
            i = j;
        }
        return ans;
    }
}
