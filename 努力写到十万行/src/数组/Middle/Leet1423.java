/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/3
 */
public class Leet1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length-k;
        int min = Integer.MAX_VALUE;
        int cot = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            if(i<=k){
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += cardPoints[i+j];
                }
                min = Math.min(min,sum);
            }
            cot += cardPoints[i];
        }
        return cot-min;
    }
}
