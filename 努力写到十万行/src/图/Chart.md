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

## LeetCode815

> 给你一个数组 `routes` ，表示一系列公交线路，其中每个 `routes[i]` 表示一条公交线路，第 `i` 辆公交车将会在上面循环行驶。
>
> - 例如，路线 `routes[0] = [1, 5, 7]` 表示第 `0` 辆公交车会一直按序列 `1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ...` 这样的车站路线行驶。
>
> 现在从 `source` 车站出发（初始时不在公交车上），要前往 `target` 车站。 期间仅可乘坐公交车。
>
> 求出 **最少乘坐的公交车数量** 。如果不可能到达终点车站，返回 `-1` 。

这题是一个典型的图问题，构建完图之后进行BFS寻找最小即可，具体如下：

1. **变量初始化**
   1.  一个二维布尔数组，用于表示公交线路之间的连接关系。
   2. 一个哈希表，用于记录每个站点有哪些公交线路经过。
2. **构建站点到公交线路的映射**
   1. 遍历每条公交线路，对于每个站点，更新哈希表。
   2. 如果两个公交线路经过同一个站点，则它们之间有连接，更新布尔数组。
3. **初始化距离数组和队列**
   1. 将所有经过起点 `source` 的公交线路加入队列 ，并将它们的距离设为 1
4. 使用 **BFS 遍历**公交线路图，更新每条公交线路到起点的最短距离。
5. **计算最小值**
   1. 遍历所有经过终点 `target` 的公交线路，找到最小的距离。
   2. 如果没有可达的公交线路，返回 -1；否则返回最小距离。



## LeetCode2374

> 给你一个有向图，图中有 `n` 个节点，节点编号从 `0` 到 `n - 1` ，其中每个节点都 **恰有一条** 出边。
>
> 图由一个下标从 **0** 开始、长度为 `n` 的整数数组 `edges` 表示，其中 `edges[i]` 表示存在一条从节点 `i` 到节点 `edges[i]` 的 **有向** 边。
>
> 节点 `i` 的 **边积分** 定义为：所有存在一条指向节点 `i` 的边的节点的 **编号** 总和。
>
> 返回 **边积分** 最高的节点。如果多个节点的 **边积分** 相同，返回编号 **最小** 的那个。

这题问入度，所以就求每个节点的入度总和

1. 比较重要的一点是 

   ```java
   arr[edges[i]] += i;
   ```

2. 之后通过新数组进行排序和找值



## LeetCode997

> 小镇里有 `n` 个人，按从 `1` 到 `n` 的顺序编号。传言称，这些人中有一个暗地里是小镇法官。
>
> 如果小镇法官真的存在，那么：
>
> 1. 小镇法官不会信任任何人。
> 2. 每个人（除了小镇法官）都信任这位小镇法官。
> 3. 只有一个人同时满足属性 **1** 和属性 **2** 。
>
> 给你一个数组 `trust` ，其中 `trust[i] = [ai, bi]` 表示编号为 `ai` 的人信任编号为 `bi` 的人。
>
> 如果小镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 `-1` 。

做题第一步先吐槽题目：周末上题997，直接就是一个字——酸爽。

这题可以使用**图**的思想来做：

1. 将每一个节点建立后计算**入度**和**出度**
2. 判断**入度是否n-1**为何**出度是否为1**

