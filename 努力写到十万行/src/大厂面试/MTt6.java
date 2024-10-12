/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/12
 */
public class MTt6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        int res = 0;
        for (char c : s.toCharArray()){
            if(c=='M'||c=='T'){
                res++;
            }
        }
        res = res + k >=s.length()? s.length():res+k;
        System.out.println(res);
    }
}
