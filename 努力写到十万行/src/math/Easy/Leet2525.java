/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/19
 */
public class Leet2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulky = false, Heavy = false;
        long V = (long) length*width*height;
        if(length>=1e4||width>=1e4||height>=1e4||V>=1e9) Bulky = true;
        if(mass>=100) Heavy = true;
        if(Bulky&&Heavy){
            return "Both";
        }else if(!Bulky&&!Heavy){
            return "Neither";
        }else if(Bulky&&!Heavy){
            return "Bulky";
        }else if(!Bulky&&Heavy){
            return "Heavy";
        }
        return "";
    }
}
