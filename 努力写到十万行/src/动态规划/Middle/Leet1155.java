/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 动态规划.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/24
 */
public class Leet1155 {
    static final int MOD = 1000000007;

    public static int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=target ; j++) {
                for (int x = 1; x <= k; x++) {
                    if(j>=x){
                    dp[i][j] = (dp[i][j] + dp[i-1][j-x])%MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }
}
