/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/7
 */
public class Leet3120 {
    public int numberOfSpecialChars(String word) {
        int[] mask = new int[2];
        for (char c : word.toCharArray()) {
            mask[c >> 5 & 1] |= 1 << (c & 31);
        }
        return Integer.bitCount(mask[0] & mask[1]);
    }
}
