/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

import java.util.ArrayList;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/31
 */
public class Leet150 {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = list.size();
            if(tokens[i].equals("+")){
                list.add(list.get(k-1) + list.get(k-2));
                list.remove(k-1);
                list.remove(k-2);
            }else if(tokens[i].equals("-")){
                list.add(list.get(k-2) - list.get(k-1));
                list.remove(k-1);
                list.remove(k-2);
            }else if(tokens[i].equals("*")){
                list.add(list.get(k-2) * list.get(k-1));
                list.remove(k-1);
                list.remove(k-2);
            }else if(tokens[i].equals("/")){
                list.add(list.get(k-2) / list.get(k-1));
                list.remove(k-1);
                list.remove(k-2);
            }else {
                list.add(Integer.parseInt(tokens[i]));
            }
        }
        return list.get(0);
    }
}
