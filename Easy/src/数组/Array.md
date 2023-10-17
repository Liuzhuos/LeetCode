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

