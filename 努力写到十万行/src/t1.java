/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/10/16
 */
public class t1 {
    public static void main(String[] args) {
        String regex = "-?0{1}[1-7][0-7]*";
        String str = "-3";
        System.out.println(str.matches(regex));
    }
}
