/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/17
 */
public class Leet2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i]==target){
                list.add(i) ;
            }
        }
        return list;
    }
}
