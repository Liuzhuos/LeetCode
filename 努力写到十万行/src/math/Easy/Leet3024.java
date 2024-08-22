/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Easy;

import javafx.scene.control.Alert;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/22
 */
public class Leet3024 {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        String s = "scalene";
        if(nums[0]+nums[1]<=nums[2]) return "none";
        if(nums[0]==nums[1]){
            s = "isosceles";
            if(nums[0]==nums[2]) return "equilateral";
        }
        if(nums[1]==nums[2]) return "isosceles";
        return s;
    }
}
