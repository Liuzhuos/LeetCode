/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 队列.Easy;

import java.util.PriorityQueue;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/26
 */
public class Leet3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->a-b);
        int n = nums.length;
        for (int x : nums){
            queue.offer(x);
        }
        for (int i = 0; i < k ; i++) {
            int x = queue.poll()*multiplier;
            queue.offer(x);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = queue.poll();
        }
        return nums;
    }
}
