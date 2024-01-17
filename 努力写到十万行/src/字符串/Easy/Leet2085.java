/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/17
 */
public class Leet2085 {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            map1.put(words1[i],map1.getOrDefault(words1[i],0)+1);
        }
        for (int i = 0; i < words2.length; i++) {
            map2.put(words2[i],map2.getOrDefault(words2[i],0)+1);
        }
        int res = 0;
        for (String w : map1.keySet()) {
            if(map1.get(w)==1&&map2.getOrDefault(w,0)==1){
                res++;
            }
        }
        return res;
    }
}
