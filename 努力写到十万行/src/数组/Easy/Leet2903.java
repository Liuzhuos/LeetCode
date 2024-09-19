/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/19
 */
public class Leet2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res = new int[2];
        int n = nums.length;
        ee:for (int i = 0; i < n-indexDifference; i++) {
            for (int j = i + indexDifference; j < n; j++) {
                if(Math.abs(nums[i]-nums[j])>=valueDifference){
                    res[0] = i;
                    res[1] = j;
                    break ee;
                }
            }
        }
        if(res[0]==0&&res[1]==0) return new int[]{-1,-1};
        return res;
    }
}
