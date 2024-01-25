/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/25
 */
public class Leet2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(Integer.bitCount(i)==k) sum += nums.get(i);
        }
        return sum;
    }
}
