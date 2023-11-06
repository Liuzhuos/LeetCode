# 字符串

## LeetCode2103

> 总计有 `n` 个环，环的颜色可以是红、绿、蓝中的一种。这些环分别穿在 10 根编号为 `0` 到 `9` 的杆上。
>
> 给你一个长度为 `2n` 的字符串 `rings` ，表示这 `n` 个环在杆上的分布。`rings` 中每两个字符形成一个 **颜色位置对** ，用于描述每个环：
>
> - 第 `i` 对中的 **第一个** 字符表示第 `i` 个环的 **颜色**（`'R'`、`'G'`、`'B'`）。
> - 第 `i` 对中的 **第二个** 字符表示第 `i` 个环的 **位置**，也就是位于哪根杆上（`'0'` 到 `'9'`）。
>
> 例如，`"R3G2B1"` 表示：共有 `n == 3` 个环，红色的环在编号为 3 的杆上，绿色的环在编号为 2 的杆上，蓝色的环在编号为 1 的杆上。
>
> 找出所有集齐 **全部三种颜色** 环的杆，并返回这种杆的数量。

这道题是简单的**字符串处理**，在运行代码中老是报错误

```java
if(arr[i].isEmpty()) continue;         if(arr[i].contains("R")&&arr[i].contains("G")&&arr[i].contains("B")){
                res++;
}
//这么写的话会报java.lang.NullPointerException
//https://blog.csdn.net/abc2576325/article/details/134046216
//此网站是解决该类问题的6中方法
//这是字符串题目中最常见的错误，是比较容易被忽略的。
```

**神级算法**：使用或运算把三个颜色转变成**二进制**，这个是非常厉害的，**从低到高**的第 0,1,2位分别表示是否有红、绿、蓝色。每一位为 1 则表示当前杆上有对应颜色的环，为 0 则表示没有。

判断的时候看这个数字**是否为7**，则可证明三个颜色存在

```java
class Solution {
    static final int POLE_NUM = 10;
    public int countPoints(String rings) {
        int[] state = new int[POLE_NUM];
        int n = rings.length();
        for (int i = 0; i < n; i += 2) {
            char color = rings.charAt(i);
            int poleIndex = rings.charAt(i + 1) - '0';
            if (color == 'R') {
                state[poleIndex] |= 1;
            } else if (color == 'G') {
                state[poleIndex] |= 2;
            } else {
                state[poleIndex] |= 4;
            }
        }
        int res = 0;
        for (int i = 0; i < POLE_NUM; i++) {
            res += state[i] == 7 ? 1 : 0;
        }
        return res;
    }
}
```

## LeetCode187

> **DNA序列** 由一系列核苷酸组成，缩写为 `'A'`, `'C'`, `'G'` 和 `'T'`.。
>
> - 例如，`"ACGAATTCCG"` 是一个 **DNA序列** 。
>
> 在研究 **DNA** 时，识别 DNA 中的重复序列非常有用。
>
> 给定一个表示 **DNA序列** 的字符串 `s` ，返回所有在 DNA 分子中出现不止一次的 **长度为 `10`** 的序列(子字符串)。你可以按 **任意顺序** 返回答案。

这道题可以使用到**位运算符**，这是很巧妙的，在之前也有过这样的用法，但一开始还是没有想到。这个叫做**位掩码**

```java
arr[i] |= 1 << (s.charAt(j)-'a');
//这一步处理很神奇，把26个字母变成了二进制，存在为1，判断是否有相同的直接看与运算是否为0
if((arr[i]&arr[j])==0)
```

