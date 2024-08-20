/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/20
 */
public class Leet551 {
    public boolean checkRecord(String s) {
        boolean isOk = true;
        if(s.contains("LLL")) isOk = false;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                flag ++;
            }
            if(flag==2) {
                isOk = false;
                break;
            }
        }
        return isOk;
    }
}
