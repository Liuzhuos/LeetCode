# 动态规划

## LeetCode1155

> 这里有 `n` 个一样的骰子，每个骰子上都有 `k` 个面，分别标号为 `1` 到 `k` 。
>
> 给定三个整数 `n` , `k` 和 `target` ，返回可能的方式(从总共 `kn` 种方式中)滚动骰子的数量，使正面朝上的数字之和等于 `target` 。
>
> 答案可能很大，你需要对 `10^9 + 7` **取模** 。

这是一个很典型的**01背包问题**，使用二维数组存储骰子个数和点数和

**注意**

1. 我们可以忽略所有`j<x`的情况;
2. 初始化需要置1

**改进**：用两个一维数组代替上面代码中的二维数组进行状态转移

```java
public int numRollsToTarget(int n, int k, int target) {
    int[] f = new int[target + 1];
    f[0] = 1;
    for (int i = 1; i <= n; ++i) {
        int[] g = new int[target + 1];
        for (int j = 0; j <= target; ++j) {
            for (int x = 1; x <= k; ++x) {
                if (j - x >= 0) {
                    g[j] = (g[j] + f[j - x]) % MOD;//使用两个数组进行交替计算
                }
            }
        }
        f = g;
    }
    return f[target];
}
```

