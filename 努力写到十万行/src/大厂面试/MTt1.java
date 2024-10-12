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
 * @date 2024/10/11
 */
public class MTt1 {
    public static String getCls(String str) {
        if (str.length() < 2) return "invalid";
        int n = str.length();
        // 记录数字和字母的个数
        int numD = 0, numL = 0;

        for (int i = 1; i < n; i++) {
            if (Character.isLetter(str.charAt(i))) {
                numL++;
            } else if (Character.isDigit(str.charAt(i))) {
                numD++;
            }
        }
        char c=str.charAt(0);

        if (Character.isLetter(c)&& numD == n - 1) {
            return "standard";
        } else if (Character.isDigit(c)&& numL == n - 1) {
            return "special";
        } else if (Character.isLetter(c)&& numD>0&&numL>0 &&numD + numL == n - 1) {
            return "mix";
        }
        return "invalid";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {
            String str = in.next();
            System.out.println(getCls(str));
            n--;
        }
    }
}
