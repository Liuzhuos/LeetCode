/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/12
 */
public class MTt9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        s = s + "a";
        int left = 0,right = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (right<s.length()){
            if (s.charAt(right)>=48&&s.charAt(right)<=57){
                right++;
            }else {
                if(s.charAt(left)>=48&&s.charAt(left)<=57){
                    list.add(Integer.parseInt(s.substring(left,right)));
                    left = right+1;
                }else {
                    left++;
                }
                right++;
            }
        }
        Collections.sort(list);
        if(k>list.size()){
            System.out.println("N");
        }else System.out.println(list.get(list.size()-k));
    }
}
