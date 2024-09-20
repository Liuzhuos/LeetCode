/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet2011 {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("X++")||operations[i].equals("++X")) res++;
            if(operations[i].equals("X--")||operations[i].equals("--X")) res--;
        }
        return res;
    }
}
