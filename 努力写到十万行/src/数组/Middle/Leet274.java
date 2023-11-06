/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/30
 */
public class Leet274 {
    public int hIndex(int[] citations) {
        int sum = 0;
        int res = 0;
        for (int h = 1; h <= citations.length; h++) {
            sum = 0;
            for (int i = 0; i < citations.length; i++) {
                if(citations[i]>= h) sum++;
            }
            if(sum>=h) res = Math.max(res,h);
        }
        return res;
    }
}
