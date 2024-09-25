/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 二分查找;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/25
 */
public class Leet852 {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0 , high = arr.length-1;
        while (low<high){
            int mid = low + high + 1 >> 1;
            if(arr[mid - 1] < arr[mid]){
                low= mid;
            }else {
                high = mid - 1;
            }
        }
        return high;
    }
}
