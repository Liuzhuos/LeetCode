/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/25
 */
public class Leet1276 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = (tomatoSlices - 2 * cheeseSlices) / 2;
        if (2 * m == tomatoSlices - 2 * cheeseSlices && m >= 0) {
            int n = cheeseSlices - m;
            if (n >= 0) {
                list.add(m);
                list.add(n);
            }
        }
        return list;
    }
}
