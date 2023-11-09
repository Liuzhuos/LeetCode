/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import javafx.scene.control.Alert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/9
 */
public class Leet2496 {
    public int maximumValue(String[] strs) {
        String s = "[^0-9]";
        int max = 0;
        Pattern compile = Pattern.compile(s);
        Matcher matcher ;
        for (int i = 0; i < strs.length; i++) {
            matcher = compile.matcher(strs[i]);
            if(matcher.find()){
                max = Math.max(max,strs[i].length());
            }else {
                int x = Integer.parseInt(strs[i]);
                max = Math.max(max,x);
            }
        }
        return max;
    }
}
