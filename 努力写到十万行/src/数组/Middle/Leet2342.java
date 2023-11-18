/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/18
 */
public class Leet2342 {
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] arr = new int[82];
        for (int num : nums){
            int s = 0;
            for (int x = num; x > 0  ; x=x/10) {
                s += x%10;
            }
            if(arr[s]>0){
                ans=Math.max(ans,arr[s] + num);
            }
            arr[s] = Math.max(arr[s],num);
        }
        return ans;
    }
}
