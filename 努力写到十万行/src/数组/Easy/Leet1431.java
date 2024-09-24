/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/24
 */
public class Leet1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for (int x : candies){
            max = Math.max(max,x);
        }
        for (int x : candies){
            if(x+extraCandies>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
