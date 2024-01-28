/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/28
 */
public class Leet365 {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity + jug2Capacity < targetCapacity){
            return false;
        }
        if(jug1Capacity==0||jug2Capacity==0){
            return targetCapacity==0 || jug1Capacity + jug2Capacity == targetCapacity;
        }
            return targetCapacity%gcd(jug1Capacity,jug2Capacity)==0;
    }
    public static int gcd(int a,int b){
        return b==0? a : gcd(b,a%b);
    }
}
