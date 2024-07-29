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
public class Leet11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0,j = n-1;
        int res = Integer.MIN_VALUE;
        while (i<=j){
            res = Math.max(res,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>height[j]) j--;
            else i++;
        }
        return res;
    }
}
