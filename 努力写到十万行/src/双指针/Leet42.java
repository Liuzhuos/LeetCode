/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/29
 */
public class Leet42 {
    public int trap(int[] height) {
        int res = 0;
        int n = height.length;
        int max_left = 0;
        int max_right = 0;
        int left = 1,right = n-2;
        for (int i = 1; i < n-1; i++) {
            if(height[left-1]<height[right+1]){
                max_left = Math.max(max_left,height[left-1]);
                int min = max_left;
                if(min>height[left]){
                    res += min - height[left];
                }
                left++;
            }else {
                max_right = Math.max(max_right,height[right+1]);
                int min = max_right;
                if(min>height[right]){
                    res += min - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
