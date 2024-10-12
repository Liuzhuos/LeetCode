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
public class MTt8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        boolean isOk = false;
        int sum =0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            sum = 0;
            isOk = false;
            while (num!=0){
                int x = num%10;
                sum += x;
                if(x%2==1){
                    isOk = true;
                }
                num /= 10;
            }
            if(sum%2==0&&isOk) res++;
        }
        System.out.println(res);
    }
}
