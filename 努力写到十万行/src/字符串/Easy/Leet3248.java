/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        int x = commands.size();
        for (int k = 0; k < x; k++) {
            if(commands.get(k).equals("UP")){
                i--;
            }else if(commands.get(k).equals("RIGHT")){
                j++;
            }else if(commands.get(k).equals("DOWN")){
                i++;
            }else if(commands.get(k).equals("LEFT")){
                j--;
            }
        }
        return i*n+j;
    }
}
