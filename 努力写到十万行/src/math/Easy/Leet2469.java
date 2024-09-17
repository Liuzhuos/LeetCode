/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/17
 */
public class Leet2469 {
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        res[0] = celsius+273.15;
        res[1] = celsius*1.8+32;
        return res;
    }
}
