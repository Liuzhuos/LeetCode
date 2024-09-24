/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/24
 */
public class Leet905 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int low = 0,high = n-1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if((nums[i]&1)==1){
                res[high--] = nums[i];
            }else{
                res[low++] = nums[i];
            }
        }
        return res;
    }
}
