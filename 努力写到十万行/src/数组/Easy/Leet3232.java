/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/19
 */
public class Leet3232 {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int sing = 0;
        int dou = 0;
        int n =nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(nums[i]>=0&&nums[i]<10){
                sing += nums[i];
            }
            if(nums[i]>=10&&nums[i]<100){
                dou += nums[i];
            }
        }
        if(sing > sum-sing || dou > sum-dou) return true;
        else  return false;
    }
}
