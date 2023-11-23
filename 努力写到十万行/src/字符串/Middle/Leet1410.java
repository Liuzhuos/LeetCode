/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/23
 */
public class Leet1410 {
    public String entityParser(String text) {
        Map<String,Character> map = new HashMap<>();
        map.put("&quot",'"');
        map.put("&apos",'\'');
        map.put("&amp",'&');
        map.put("&gt",'>');
        map.put("&lt",'<');
        map.put("&frasl",'\\');
        StringBuffer sb = new StringBuffer(text);
        String s = "";
        for (int i = 0; i < sb.length(); ) {
            if(sb.charAt(i)=='&') {
                s = "";
                for (int j = 0; j <= 6; j++) {
                    if(sb.charAt(i+j)!=';'){
                        s += sb.charAt(i+j);
                    }else {
                        i += (j+1);
                        break;
                    }
                }
                if(map.containsKey(s)){
                    sb.replace(i-s.length()-1,i, String.valueOf(map.get(s)));
                    i -= s.length();
                }
            }else
                i++;
        }
        return sb.toString();
    }
}
