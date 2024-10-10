# 队列

队列的**实现类**

```java
Queue接口中有以下几个常用实现类：

PriorityQueue：非阻塞、非线程安全、无边界，支持优先级队列实现类。
ConcurrentLinkedQueue：非阻塞、线程安全、无边界，基于链接节点的队列实现类。
ArrayBlockingQueue：阻塞、线程安全、有边界，创建的时候指定大小，一旦创建容量不可改变实现类，默认是不保证线程的公平性，不允许向队列中插入null元素。
LinkedBlockingQueue：阻塞、线程安全、可选有边界，一个由链表结构组成的可选有界阻塞队列实现类，如果未指定容量，那么容量将等 Integer.MAX_VALUE。
PriorityBlockingQueue：阻塞、线程安全、无边界，支持优先级排序的无边界阻塞队列实现类。
DelayQueue：阻塞、线程安全、无边界，使用优先级队列实现的无界阻塞队列实现类，只有在延迟期满时才能从中提取元素。
SynchronousQueue：阻塞、线程安全、无数据队列，不存储元素、没有内部容量的阻塞队列实现类。
LinkedBlockingDeque：阻塞、线程安全、无边界，由链表结构组成的可选范围双向阻塞队列实现类，如果未指定容量，那么容量将等于 Integer.MAX_VALUE
```



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

## LeetCode117

> 给定一个二叉树：
>
> ```
> struct Node {
>   int val;
>   Node *left;
>   Node *right;
>   Node *next;
> }
> ```
>
> 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 `NULL` 。
>
> 初始状态下，所有 next 指针都被设置为 `NULL` 。

```java
Queue<Node> queue = new ArrayDeque<Node>();
//ArrayDeque是Deque 接口的大小可变数组的实现
```



## LeetCode1700

> 学校的自助午餐提供圆形和方形的三明治，分别用数字 `0` 和 `1` 表示。所有学生站在一个队列里，每个学生要么喜欢圆形的要么喜欢方形的。
> 餐厅里三明治的数量与学生的数量相同。所有三明治都放在一个 **栈** 里，每一轮：
>
> - 如果队列最前面的学生 **喜欢** 栈顶的三明治，那么会 **拿走它** 并离开队列。
> - 否则，这名学生会 **放弃这个三明治** 并回到队列的尾部。
>
> 这个过程会一直持续到队列里所有学生都不喜欢栈顶的三明治为止。
>
> 给你两个整数数组 `students` 和 `sandwiches` ，其中 `sandwiches[i]` 是栈里面第 `i` 个三明治的类型（`i = 0` 是栈的顶部）， `students[j]` 是初始队列里第 `j` 名学生对三明治的喜好（`j = 0` 是队列的最开始位置）。请你返回无法吃午餐的学生数量。

题目是比较容易懂的，方法就是使用**队列**进行遍历

1. 学生入队列，取第一个判断
2. OK下一个，不行从新入队列
   1. 要会维护一个三明治的数量
3. 最后返回一直入队的次数即可
