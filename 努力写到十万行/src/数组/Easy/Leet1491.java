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
 * @date 2024/10/3
 */
public class Leet1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        int n = salary.length;
        for (int i = 1; i < salary.length-1; i++) {
            sum += salary[i];
        }
        return sum*1.0/(n-2);
    }
}
