/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/20
 */
public class Leet2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (String w : words) {
            for (String s : w.split(Pattern.quote(String.valueOf(separator)))) {
                if (s.length() > 0) {
                    list.add(s);
                }
            }
        }
        return list;
    }
}
