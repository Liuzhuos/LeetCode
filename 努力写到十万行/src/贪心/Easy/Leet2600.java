/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 贪心.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/13
 */
public class Leet2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int x = 0 ;
        if(k<=numOnes) return k;
        if(k>numOnes&&k<=numOnes+numZeros) return numOnes;
        if(k>numOnes+numZeros) return numOnes - (k-numOnes-numZeros);
        return x;
    }
}
