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
 * @date 2024/9/23
 */
public class Leet1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        for(int x : stones){
            queue.offer(x);
        }
        while (queue.size()>1){
            int a = queue.poll();
            int b = queue.poll();
            queue.offer(a-b);
        }
        return queue.isEmpty()? 0 : queue.poll();
    }
}
