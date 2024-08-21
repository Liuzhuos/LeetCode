/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (key == value) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
