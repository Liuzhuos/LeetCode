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

## LeetCode2558

> 给你一个整数数组 `gifts` ，表示各堆礼物的数量。每一秒，你需要执行以下操作：
>
> - 选择礼物数量最多的那一堆。
> - 如果不止一堆都符合礼物数量最多，从中选择任一堆即可。
> - 选中的那一堆留下平方根数量的礼物（向下取整），取走其他的礼物。
>
> 返回在 `k` 秒后剩下的礼物数量*。*

此题是比较简单的数组运算，按逻辑写代码就可以了，但写出来的代码**内存过大**，可以使用**优先队列**进行代码优化。

```java
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        //优先队列默认是小顶堆，最小元素在堆顶，使用lambda语法变成了最大堆，也就是说根据优先级的关系栈顶的数字永远是最大的
        for (int gift : gifts) {
            pq.offer(gift); // offer方法是将指定的元素插入此优先级队列。不能添加null元素。
        }
        while (k > 0) {
            k--;
            int x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }
        long res = 0;
        while (!pq.isEmpty()) { //判空
            res += pq.poll(); //poll方法是删除元素：删除堆顶元素——队列为空的时候返回null
        }
        return res;
    }
}
//https://blog.csdn.net/qq_43776742/article/details/92831821
//此网站是优先队列的常用方法
```

## LeetCode274/275

> 给你一个整数数组 `citations` ，其中 `citations[i]` 表示研究者的第 `i` 篇论文被引用的次数。计算并返回该研究者的 **`h` 指数**。
>
> 根据维基百科上 [h 指数的定义](https://baike.baidu.com/item/h-index/3991452?fr=aladdin)：`h` 代表“高引用次数” ，一名科研人员的 `h` **指数** 是指他（她）至少发表了 `h` 篇论文，并且每篇论文 **至少** 被引用 `h` 次。如果 `h` 有多种可能的值，**`h` 指数** 是其中最大的那个。

使用两次**循环**，外循环遍历h，也就是说依次增大h值看匹配值，在代码(自己写的)中并没有写中断，它会依次遍历到结束，会有很大的改进空间

```java
//在代码中加入break语句可以减少执行用时
if(sum>=h) res = Math.max(res,h);
else break;
```

也可以使用**计数排序**

根据定义，我们可以发现 H 指数不可能**大于**总的论文发表数，所以对于引用次数超过论文发表数的情况，我们可以将其按照总的论文发表数来计算即可。这样我们可以限制参与排序的数的大小为 [0,n]（其中 n 为总的论文发表数），使得计数排序的时间复杂度降低到 O(n)。

最后我们可以**从后向前遍历**数组 counter，对于每个 0≤i≤n，在数组 counter 中得到大于或等于当前引用次数 iii 的总论文数。当我们找到一个 H 指数时跳出循环，并返回结果。

```java
public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length, tot = 0;
        int[] counter = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) { // 比数组大的放到最后累加
                counter[n]++;
            } else {
                counter[citations[i]]++; // 比数组小的放到数组前n个里
            }
        }
        for (int i = n; i >= 0; i--) {
            tot += counter[i]; //从后依次累和后，当tot>=i时就返回i的值，此时的i就是最大值
            if (tot >= i) {
                return i;
            }
        }
        return 0;
    }
}
```

## LeetCode2465

> 给你一个下标从 **0** 开始长度为 **偶数** 的整数数组 `nums` 。
>
> 只要 `nums` **不是** 空数组，你就重复执行以下步骤：
>
> - 找到 `nums` 中的最小值，并删除它。
> - 找到 `nums` 中的最大值，并删除它。
> - 计算删除两数的平均值。
>
> 两数 `a` 和 `b` 的 **平均值** 为 `(a + b) / 2` 。
>
> - 比方说，`2` 和 `3` 的平均值是 `(2 + 3) / 2 = 2.5` 。
>
> 返回上述过程能得到的 **不同** 平均值的数目。
>
> **注意** ，如果最小值或者最大值有重复元素，可以删除任意一个。

这是一道简单题，在一开始的时候想的比较复杂，没有想到使用**排序**，还想着用递归来去掉最大值和最小值，看了题解之后发现方法非常巧妙。

1. 使用排序将最大值和最小值放到数组两段
2. 使用**Set来去重**，结果直接返回**size**
3. Set的**泛型**是**Integer**，没有使用Float，这个太聪明了，使用累和，不使用平均数，从而简化了计算难度，并且也避开了**浮点数**的问题。

```java
Set<Integer> set = new HashSet<>();
/*
add() ： 向集合中添加元素；
size() ： 统计集合内元素个数；
isEmpty() ： 判断集合是否为空；
*/
```

