/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 日历类.Easy;

import java.util.Calendar;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/16
 */
public class Leet1154 {
    public int dayOfYear(String date) {
        String[] time = date.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(time[0]),Integer.parseInt(time[1])-1,Integer.parseInt(time[2]));
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        return day;

    }
}
