# 图

图中使用的方法无非就是**迪杰斯特拉**和**弗洛伊德**算法

**floyd是先固定中间节点，然后遍历所有其入度和出度的点。dijkstra是先固定源节点，然后遍历所有可能的中间节点和目的节点。但是floyd用的时候只能用来找所有点到所有点的最短路，而dijkstra可以只找一个点到所有点的最短路**！！！！！

```java
//Floyd算法 -> 得到任意两点之间的最短路
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[] ans = {Integer.MAX_VALUE / 2, -1};
        int[][] mp = new int[n][n];
        for (int i = 0; i < n; ++i) { //元素初始化，都置为最大值，这里除以2是因为要进行相加，防止溢出
            Arrays.fill(mp[i], Integer.MAX_VALUE / 2);
        }
        for (int[] eg : edges) { //将题目数据存储
            int from = eg[0], to = eg[1], weight = eg[2];
            mp[from][to] = mp[to][from] = weight;
        }
        for (int k = 0; k < n; ++k) { //！！！！这里就是重点啦
            mp[k][k] = 0; //自己到自己就是0
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    mp[i][j] = Math.min(mp[i][j], mp[i][k] + mp[k][j]); //动态规划的状态方程  也就是把最小值存起来，直接到还是中间有个过渡。
                }
            }
        }
        //其下就是根据题意进行操作
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (mp[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt <= ans[0]) {
                ans[0] = cnt;
                ans[1] = i;
            }
        }
        return ans[1];
    }
}
```

```java
//Dijkstra算法 -> 每一个节点求解单源最短路，某一个节点到其它所有节点的最短距离
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[] ans = {Integer.MAX_VALUE / 2, -1};
        int[][] dis = new int[n][n];
        boolean[][] vis = new boolean[n][n];
        int[][] mp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dis[i], Integer.MAX_VALUE / 2);
            Arrays.fill(mp[i], Integer.MAX_VALUE / 2);
        }
        for (int[] eg : edges) { //题目数据
            int from = eg[0], to = eg[1], weight = eg[2];
            mp[from][to] = mp[to][from] = weight;
        }
        for (int i = 0; i < n; ++i) {
            dis[i][i] = 0;
            for (int j = 0; j < n; ++j) {
                int t = -1;
                for (int k = 0; k < n; ++k) {
                    if (!vis[i][k] && (t == -1 || dis[i][k] < dis[i][t])) {
                        t = k;
                    }
                }
                for (int k = 0; k < n; ++k) {
                    dis[i][k] = Math.min(dis[i][k], dis[i][t] + mp[t][k]);
                }
                vis[i][t] = true;
            }
        }
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (dis[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt <= ans[0]) {
                ans[0] = cnt;
                ans[1] = i;
            }
        }
        return ans[1];
    }
}
```

