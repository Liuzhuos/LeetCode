/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;




import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/29
 */
public class Leet682 {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        int n = operations.length;
        for (int i = 0; i < n; i++) {
            if(operations[i].equals("+")){
                k = list.size();
                list.add(list.get(k-3)+list.get(k-2));
            }else if(operations[i].equals("D")){
                k = list.size();
                list.add(list.get(k-2)*2);
            } else if(operations[i].equals("C")){
                k = list.size();
                list.remove(k-2);
            }else {
                list.add(Integer.parseInt(operations[i]));
            }
        }
        return list.stream().reduce(0,(a,b)->a+b);
    }
}
