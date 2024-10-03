/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet2169 {
    public int countOperations(int num1, int num2) {
        return num1 == 0 || num2 == 0 ? 0 : (num1 >= num2 ? num1 / num2 + countOperations(num1 % num2, num2) : num2 / num1 + countOperations(num1, num2 % num1));
    }
}
