/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/29
 */
public class Leet2706 {
    public int buyChoco(int[] prices, int money) {
        if(prices.length<2) return money;
        Arrays.sort(prices);
        int res = prices[0] + prices[1];
        if(res<=money){
            return money - res;
        }else return money;
    }
}
