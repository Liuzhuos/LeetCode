/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/26
 */
public class Leet2765 {
    public int alternatingSubarray(int[] nums) {
        int l = 0, r = 1, next = 1, ans = -1;
        while (r < nums.length) {
            int differ = nums[r] - nums[r - 1];
            //保证窗口内元素满足交替数组的条件
            if (differ != next) {
                l = differ == 1 ? r - 1 : r;
                next = differ == 1 ? 1 : -1;
            }
            next = -next;
            if (++r - l > 1) ans = Math.max(ans, r - l);
        }
        return ans;
    }
}
