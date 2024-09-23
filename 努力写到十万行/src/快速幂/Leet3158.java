/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 快速幂;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet3158 {
    public int duplicateNumbersXOR(int[] nums) {
        int res = 0;
        long vis = 0;
        for (int x :nums){
            if((vis>>x&1)==1){ //判断vis中是否有这个数字
                res ^= x;
            }else {
                vis |= 1L << x;
            }
        }
        return res;
    }
}
