/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet958 {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        int sum = 0;
        for (int x : nums){
            if ((x&1)==0){
                sum += x;
            }
        }
        for (int i = 0; i < n; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if((nums[index]&1)==1){
                if((val&1)==1){
                    sum += nums[index] + val;
                }
            }else {
                if((val&1)==1){
                    sum -= nums[index];
                }else {
                    sum += val;
                }
            }
            nums[index] += val;
            res[i] = sum;
        }
        return res;
    }
}
