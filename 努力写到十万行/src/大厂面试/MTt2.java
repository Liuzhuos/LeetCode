/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class MTt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =Integer.parseInt(in.nextLine());
        String s =in.nextLine();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i]=in.nextLine();
        }
        solve(n,s,strs);

        in.close();
    }

    static void solve(int n, String s, String[] strs){
        Set<String> set = new HashSet<>();
        for(String str:strs){
            set.add(str);
        }
        int total =set.size();
        int len = s.length();
        int ls =0, mr = 0; //记录长度小于和大于len的字符串个数
        for(String str:set){
            if(str.length()<len){
                ls++;
            }else if(str.length()>len){
                mr++;
            }
        }
        int minTimes = ls+1;
        int maxTimes =total-mr;
        System.out.print(minTimes+" "+maxTimes);
    }
}
