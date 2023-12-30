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
 * @date 2023/12/30
 */
public class Leet1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar instance = Calendar.getInstance();
        instance.set(year,month-1,day);
        int x = instance.get(Calendar.DAY_OF_WEEK);
        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return arr[x-1];
    }
}
