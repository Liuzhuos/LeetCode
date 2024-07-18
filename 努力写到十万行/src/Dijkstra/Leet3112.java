/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/18
 */
public class Leet3112 {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        //构造每个节点
        List<int[]>[] adj = new List[n];  //n个节点
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>(); //列表存放 节点和值
        }
        //初始化值
        for (int[] edge :edges){
            int u = edge[0],v = edge[1],length = edge[2];
            adj[u].add(new int[]{v,length});
            adj[v].add(new int[]{u,length});
        }
        //建立优先队列，创建最小堆
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[0]-b[0]);
        //
        pq.offer(new int[]{0, 0});

        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        answer[0] = 0;
        //判断非空
        while (!pq.isEmpty()) {
            //检索并删除此队列的头部，如果此队列为空，则返回 null 。
            int[] arr = pq.poll();
            int t = arr[0], u = arr[1];
            if (t != answer[u]) {
                continue;
            }
            for (int[] next : adj[u]) {
                int v = next[0], length = next[1];
                if (t + length < disappear[v] && (answer[v] == -1 || t + length < answer[v])) {
                    pq.offer(new int[]{t + length, v});
                    answer[v] = t + length;
                }
            }
        }
        return answer;

    }
}
