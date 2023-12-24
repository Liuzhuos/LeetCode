/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/24
 */
public class Leet1954 {
    public long minimumPerimeter(long neededApples) {
        long n = 1;
        while ((n + 1) * (2 * n + 1) * (2 * n) < neededApples) {
            n++;
        }
        return n * 8;
    }

}
