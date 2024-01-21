/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/21
 */
public class Leet228 {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if (nums.length==0) return list;
        int low = 0, hight = 1;
        while (hight<nums.length){
            if(nums[hight-1] + 1 != nums[hight]) {
                if(hight-low==1){
                    list.add(String.valueOf(nums[low]));
                }else {
                    list.add(nums[low] + "->" + nums[hight-1]);
                }
                low = hight;
            }
            hight++;
        }
        if(hight-low==1){
            list.add(String.valueOf(nums[low]));
        }else {
            list.add(nums[low] + "->" + nums[hight-2]);
        }
        return list;
    }
}
