# 数组

## LeetCode260

此题使用**Map**统计数字个数，是一个比较常用的Map例题。

```java
//Map创建需要使用哈希表
Map<Integer, Integer> map = new HashMap<>();
//增强for循环
//map.getOrDefault(i, 0)此方法为map的常用方法，put放入时使用所给数没如果没有所给数就放默认数
for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
```

此题还有其他数学解法——使用**异或**进行求解

这种方法是很巧妙的，使用异或进行**去重**，第一次遍历异或后的值是单次数字的异或值，之后获取**从右向左的第一个1**所得到的数字，与原数组进行**第二次异或**就可以分开两个组啦

```java
     s = 101100
    ~s = 010011
(~s)+1 = 010100 // 根据补码的定义，这就是 -s   最低 1 左侧取反，右侧不变
s & -s = 000100 // lowbit
```

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        int xorAll = 0;
        for (int x : nums) {
            xorAll ^= x;
        }
        int lowbit = xorAll & -xorAll;
        int[] ans = new int[2];
        for (int x : nums) {
            ans[(x & lowbit) == 0 ? 0 : 1] ^= x; // 分组异或
        }
        return ans;
    }
}
```

## LeetCode1645

> 矩形蛋糕的高度为 `h` 且宽度为 `w`，给你两个整数数组 `horizontalCuts` 和 `verticalCuts`，其中：
>
> -  `horizontalCuts[i]` 是从矩形蛋糕顶部到第 `i` 个水平切口的距离
> - `verticalCuts[j]` 是从矩形蛋糕的左侧到第 `j` 个竖直切口的距离
>
> 请你按数组 *`horizontalCuts`* 和 *`verticalCuts`* 中提供的水平和竖直位置切割后，请你找出 **面积最大** 的那份蛋糕，并返回其 **面积** 。由于答案可能是一个很大的数字，因此需要将结果 **对** `109 + 7` **取余** 后返回。

这个题一撇很难，其实根据图进行分析发现，这是一道**贪心算法**的题，最大的那块蛋糕就是**相邻两条切线的最大长度**。

1. 将数组补两个边界，加入0和右边界（下边界）
2. 对一个数值进行排序
3. 找出最大相邻值
4. 相乘取模得结果

需要注意的是，**取模**的数是9位数
