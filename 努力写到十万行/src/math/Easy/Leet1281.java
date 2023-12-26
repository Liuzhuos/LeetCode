/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

import sun.print.SunMinMaxPage;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/26
 */
public class Leet1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = 1;
        while (n != 0) {
            int x = n % 10;
            n /= 10;
            mult *= x;
            sum += x;
        }
        return mult-sum;
    }
}
