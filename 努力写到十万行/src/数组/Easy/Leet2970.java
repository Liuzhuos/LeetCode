/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/11
 */
public class Leet2970 {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int res = 0;
        int l = 1;
        while (l < n && nums[l - 1] < nums[l]) { //标识到非递增
            l++;
        }
        res += l + (l < n ? 1 : 0);//直接将左侧数据存入
        for (int r = n - 2; r >= 0; r--) {
            while (l > 0 && nums[l - 1] >= nums[r + 1]) {
                l--;
            }
            res += l + (l <= r ? 1 : 0);
            if (nums[r] >= nums[r + 1]) {
                break;
            }
        }
        return res;
    }
}
