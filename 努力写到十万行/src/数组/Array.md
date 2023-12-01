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

## LeetCode1465

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

## LeetCode2460

> 给你一个下标从 **0** 开始的数组 `nums` ，数组大小为 `n` ，且由 **非负** 整数组成。
>
> 你需要对数组执行 `n - 1` 步操作，其中第 `i` 步操作（从 **0** 开始计数）要求对 `nums` 中第 `i` 个元素执行下述指令：
>
> - 如果 `nums[i] == nums[i + 1]` ，则 `nums[i]` 的值变成原来的 `2` 倍，`nums[i + 1]` 的值变成 `0` 。否则，跳过这步操作。
>
> 在执行完 **全部** 操作后，将所有 `0` **移动** 到数组的 **末尾** 。
>
> - 例如，数组 `[1,0,2,0,0,1]` 将所有 `0` 移动到末尾后变为 `[1,2,1,0,0,0]` 。
>
> 返回结果数组。
>
> **注意** 操作应当 **依次有序** 执行，而不是一次性全部执行。

按部就班的写代码就好了，值得注意的是在0放到尾的时候建立**新的数组**，通过判断**非零存入**，new出的数组**默认为0**。

## LeetCode2352

> 给你一个下标从 **0** 开始、大小为 `n x n` 的整数矩阵 `grid` ，返回满足 `Ri` 行和 `Cj` 列相等的行列对 `(Ri, Cj)` 的数目*。*
>
> 如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。

这题依旧是**遍历**，在刚看到题时的想法是使用字符串，比较每一个字符串的子串是否存在，这样就可以判断是否是相同数组，但忽略了必须**顺序**一致，如果出现[11,1],[1,11]这样的就会失效。如下是**错误代码**

```java
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += grid[i][j];
            }
            for (int k = 0; k < n; k++) {
                String s1 = "";
                for (int j = 0; j < n; j++) {
                    s1 += grid[j][k];
                    if(!s.contains(s1)){
                        break;
                    }
                    if(j==n-1) res++;
                }
            }
        }
        return res;
    }
}
```

通过学习Map来做这道题，刚好利用了Map表中可以**存储list**，并且有**containsKey**方法进行列表对比。

```java
Map<List<Integer>, Integer> cnt = new HashMap<List<Integer>, Integer>();
//Map初始化，第一个参数是列表，第二个是这个列表出现的个数

cnt.put(arr, cnt.getOrDefault(arr, 0) + 1);
//getOrDefault方法将列表放入Map中，如果相同的话+1，因为Map是会去重的

if (cnt.containsKey(arr))
// containsKey判断是否有这个键
```

## LeetCode2475

> 给你一个下标从 **0** 开始的正整数数组 `nums` 。请你找出并统计满足下述条件的三元组 `(i, j, k)` 的数目：
>
> - `0 <= i < j < k < nums.length`
>
> - nums[i]、nums[j]、nums[k]两两不同
>
>   换句话说：`nums[i] != nums[j]`、`nums[i] != nums[k]` 且 `nums[j] != nums[k]` 。
>
> 返回满足上述条件三元组的数目*。*

这是一道比较简单的**循环嵌套**的题，分享的是**神级算法**

记当前遍历的元素数目 v，先前遍历的元素总数目为 t，那么以当前遍历的元素为中间元素的符合条件的三元组数目为：*t*×*v*×(*n*−*t*−*v*)

```java
class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            count.merge(x, 1, Integer::sum);
        }
        int res = 0, n = nums.length, t = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            res += t * entry.getValue() * (n - t - entry.getValue());
            t += entry.getValue();
        }
        return res;
    }
}
//https://blog.csdn.net/q5706503/article/details/85122343
//此网站是Map的使用方法

//Integer::sum 是java中的静态方法，类似与lambda表达式
```

## LeetCode421

> 给你一个整数数组 `nums` ，返回 `nums[i] XOR nums[j]` 的最大运算结果，其中 `0 ≤ i ≤ j < n` 。

这道题是第一道没有通过的题，哎！！！提交的代码**运行超时**，通过查阅题解得知了**减少内存**的方法

```java
class Solution {
    // 最高位的二进制位编号为 30
    static final int HIGH_BIT = 30;

    public int findMaximumXOR(int[] nums) {
        int x = 0;
        for (int k = HIGH_BIT; k >= 0; --k) {
            Set<Integer> seen = new HashSet<Integer>();
            // 将所有的 pre^k(a_j) 放入哈希表中
            for (int num : nums) {
                // 如果只想保留从最高位开始到第 k 个二进制位为止的部分
                // 只需将其右移 k 位
                seen.add(num >> k);
            }

            // 目前 x 包含从最高位开始到第 k+1 个二进制位为止的部分
            // 我们将 x 的第 k 个二进制位置为 1，即为 x = x*2+1
            int xNext = x * 2 + 1;
            boolean found = false;
            
            // 枚举 i
            for (int num : nums) {
                if (seen.contains(xNext ^ (num >> k))) {
                    found = true;
                    break;
                }
            }

            if (found) {
                x = xNext;
            } else {
                // 如果没有找到满足等式的 a_i 和 a_j，那么 x 的第 k 个二进制位只能为 0
                // 即为 x = x*2
                x = xNext - 1;
            }
        }
        return x;
    }
}
```

根据按位异或运算的性质，**x=ai⊕aj**等价于 **aj=x⊕ai**，我们可以根据这一变换，设计一种「**从高位到低位依次确定 x 二进制表示的每一位**」的方法

## LeetCode2300

> 给你两个正整数数组 `spells` 和 `potions` ，长度分别为 `n` 和 `m` ，其中 `spells[i]` 表示第 `i` 个咒语的能量强度，`potions[j]` 表示第 `j` 瓶药水的能量强度。
>
> 同时给你一个整数 `success` 。一个咒语和药水的能量强度 **相乘** 如果 **大于等于** `success` ，那么它们视为一对 **成功** 的组合。
>
> 请你返回一个长度为 `n` 的整数数组 `pairs`，其中 `pairs[i]` 是能跟第 `i` 个咒语成功组合的 **药水** 数目。

这道题主要考查**二分查找**，还有**向上取整**

```java
//这是一种向上取整的办法
long t = (success + spells[i] - 1) / spells[i] - 1;

//二分查找
public static int binarysearch(int[] arr,int value) {
		int low=0;//指针low表示待查元素所在范围的下界，下界索引从0开始
		int high=arr.length-1;//指针high表示待查元素所在范围的上界
		while(low<=high) {
			int mid=(low+high)/2;//指针mid表示中间位置，且是向下取整
			if(arr[mid]==value) {//若中间位置值等于我们所需要查找值，即返回中间值
				return mid;
			}
			if(arr[mid]<value) {//若中间位置值小于我们所需查找值，则在后半段中查找，即将下界值变为mid+1,上界值不变
				low=mid+1;
			}
			if(arr[mid]>value) {//若中间位置值大于我们所需查找值，则在前半段中查找，即将上界值变为mid-1,下界值不变
				high=mid-1;
			}
		}
		return -1;//若查找不到我们所需要值，即返回-1
	}
```

## LeetCode2760

> 给你一个下标从 **0** 开始的整数数组 `nums` 和一个整数 `threshold` 。
>
> 请你从 `nums` 的子数组中找出以下标 `l` 开头、下标 `r` 结尾 `(0 <= l <= r < nums.length)` 且满足以下条件的 **最长子数组** ：
>
> - `nums[l] % 2 == 0`
> - 对于范围 `[l, r - 1]` 内的所有下标 `i` ，`nums[i] % 2 != nums[i + 1] % 2`
> - 对于范围 `[l, r]` 内的所有下标 `i` ，`nums[i] <= threshold`
>
> 以整数形式返回满足题目要求的最长子数组的长度。
>
> **注意：子数组** 是数组中的一个连续非空元素序列。

这题我要想的要绝望了  一开始我想固定左端，遍历右边使用双指针。但是代码有问题，问题是超时。观看别人的题解是比较清晰的。

思路如下：

1. 从前往后扫描 nums，变量 i 作为当前子数组左端点，首先确保 i 的合法性（跳过不满足 **nums[i] % 2 = 0 和 nums[i] <= threshold** 的位置）
2. 随后在固定左端点 i 前提下，找最远的（第一个不满足要求的）右端点 j（值不超过 threshold，且**奇偶性与前值交替**）
3. 得到当前连续段长度**[i,j−1]**，更新 ans，从当前结束位置 j 开始，重复上述过程，直到处理完 **nums**

> ## LeetCode2342
>
> 给你一个下标从 **0** 开始的数组 `nums` ，数组中的元素都是 **正** 整数。请你选出两个下标 `i` 和 `j`（`i != j`），且 `nums[i]` 的数位和 与 `nums[j]` 的数位和相等。
>
> 请你找出所有满足条件的下标 `i` 和 `j` ，找出并返回 `nums[i] + nums[j]` 可以得到的 **最大值** *。*

妙！！！

不妨设 i<j。枚举 nums[j]，设 nums[j]的数位和为 s，我们需要知道 j 左边的数位和也等于 s 的最大的 nums[i]。可以用一个哈希表（或者数组）mx[s]记录数位和为 s 对应的最大的 nums[i]。

用 mx[s]+nums[j]更新答案的最大值。

```java
if(arr[s]>0){
    ans=Math.max(ans,arr[s] + num);//已有数字返回结果
}
arr[s] = Math.max(arr[s],num);//更新
```

这个题解非常巧妙，佩服且易懂

## LeetCode2500

> 给你一个 `m x n` 大小的矩阵 `grid` ，由若干正整数组成。
>
> 执行下述操作，直到 `grid` 变为空矩阵：
>
> - 从每一行删除值最大的元素。如果存在多个这样的值，删除其中任何一个。
> - 将删除元素中的最大值与答案相加。
>
> **注意** 每执行一次操作，矩阵中列的数据就会减 1 。
>
> 返回执行上述操作后的答案。

思路简单，**排序**后找**每列最大值**

## LeetCode2661

> 给你一个下标从 **0** 开始的整数数组 `arr` 和一个 `m x n` 的整数 **矩阵** `mat` 。`arr` 和 `mat` 都包含范围 `[1，m * n]` 内的 **所有** 整数。
>
> 从下标 `0` 开始遍历 `arr` 中的每个下标 `i` ，并将包含整数 `arr[i]` 的 `mat` 单元格涂色。
>
> 请你找出 `arr` 中在 `mat` 的某一行或某一列上都被涂色且下标最小的元素，并返回其下标 `i` 。

这是一道中等难度的题，其实只需要按照题目要求进行编写就好了，去其中使用**哈希表**进行存储，之后**统计行或列的个数是否达到边界**即可。

```java
//哈希表存储 数字存储和位置
Map<Integer, int[]> map = new HashMap<Integer, int[]>();
```

