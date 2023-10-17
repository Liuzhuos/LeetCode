/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math;

import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/17
 */
public class Leet2652 {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%3==0||i%5==0||i%7==0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumOfMultiples(n));
    }
}
