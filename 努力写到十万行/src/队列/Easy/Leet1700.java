/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 队列.Easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/10
 */
public class Leet1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int x : students){
            queue.offer(x);
        }
        int n = sandwiches.length;
        int k = 0;
        int i = 0;
        while (k!=n){
            int m =queue.poll();
            if(m==sandwiches[i]){
                k = 0;
                i++;
                n--;
            }else {
                queue.offer(m);
                k++;
            }
        }
        return k;
    }
}
