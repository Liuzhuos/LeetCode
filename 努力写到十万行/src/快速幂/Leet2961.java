/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/30
 */
public class Leet2961 {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list = new ArrayList<>();
        int n = variables.length;
        for (int i = 0; i < n; i++) {
            int[] v = variables[i];
            if (powMod(powMod(v[0], v[1], 10), v[2], v[3]) == target) {
                list.add(i);
            }
        }
        return list;
    }

    public static int powMod(int x, int y, int mod) {
        int res = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }
}
