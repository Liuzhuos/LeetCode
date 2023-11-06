/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/5
 */
public class Leet187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> cnt = new HashMap<>();
        int n =s.length();
        for(int i = 0;i<=n-10;i++){
            String sub = s.substring(i,i+10);
            cnt.put(sub,cnt.getOrDefault(sub,0) + 1);
            if(cnt.get(sub)==2) {
                ans.add(sub);
            }
        }
        return ans;
    }
}
