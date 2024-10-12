/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/12
 */
public class MTt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }

        // 二维数组前缀和
        // dp[i][j] 表示matrix矩阵中以 (i-1, j-1) 位置为右下角点的矩形中1的数量
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 此处公式请看图示说明
                dp[i][j] = (matrix[i - 1][j - 1] - '0') + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        // i 表示正方形边长
        for (int i = 2; i <= n; i += 2) {
            // i 为奇数时, 则对应 i*i 正方形面积也为奇数, 不可能平分, 所以不存在01平衡的
            System.out.println(0);

            // i 为偶数时
            int count = 0; // 记录01平衡的i*i正方形数量
            for (int r = i; r <= n; r++) {
                for (int c = i; c <= n; c++) {
                    // 正方形中1的数量
                    int oneCount = dp[r][c] - dp[r][c - i] - dp[r - i][c] + dp[r - i][c - i];

                    // 如果正方形中1的数量 == 正方形面积的一半，则形成01平衡
                    if (oneCount * 2 == i * i) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

        // 如果 n 是奇数，则上面for循环会遗漏 n*n 正方形的01平衡判断
        if (n % 2 != 0) {
            System.out.println(0);
        }
    }
}
