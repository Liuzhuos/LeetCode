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
public class MTt5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        long sum = 0;
        long onesum = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if(x==0) onesum++;
            sum += x;
        }
        while (q-->0){
            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(sum+l*onesum + " " + (sum+r*onesum));
        }
    }
}
