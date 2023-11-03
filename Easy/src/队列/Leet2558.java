/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 队列;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/29
 */
public class Leet2558 {
    public long pickGifts(int[] gifts, int k) {
        long res = 0;
        for (int i = 0; i < gifts.length; i++) {
            res += gifts[i];
        }
        for (int i = 0; i < k; i++) {
            Arrays.sort(gifts);
            int x = (int)Math.sqrt(gifts[gifts.length-1]);
            res = res - gifts[gifts.length-1] + x;
            gifts[gifts.length-1] = x ;
        }
        return res;
    }
}
