/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/29
 */
public class Leet2951 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        int n = mountain.length;
        for (int i = 1; i < n-1; i++) {
            if(mountain[i-1]<mountain[i]&&mountain[i]>mountain[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}
