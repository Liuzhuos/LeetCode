/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/27
 */
public class Leet2861 {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int left = 1 ,right = 200000000,res = 0;
        while (left<=right){
            int mid = left + (right - left)/2;
            boolean valid = false;
            for (int i = 0; i < k; i++) {
                long spend = 0;
                for (int j = 0; j < n; j++) {
                    spend += Math.max((long) composition.get(i).get(j) * mid - stock.get(j), 0) * cost.get(j);
                }
                if(spend<=budget){
                    valid = true;
                    break;
                }
            }
            if(valid){
                res = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return res;
    }
}
