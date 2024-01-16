# Calendar日历类

日历类专攻日期类的题，像某天是某个月的第几天等等之类的题。

```java
//如何使用
Calendar instance = Calendar.getInstance();
instance.set(year,month-1,day);
```

> 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
>
> 输入为三个整数：`day`、`month` 和 `year`，分别表示日、月、年。
>
> 您返回的结果必须是这几个值中的一个 `{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}`。

终于碰到了日历类的题，但还是有点难搞，忘记了**月份需要减一**

突破这个问题，就比较简单了

还需要注意的是，日期是1-7

## LeetCode1154

> 给你一个字符串 `date` ，按 `YYYY-MM-DD` 格式表示一个 [现行公元纪年法](https://baike.baidu.com/item/公元/17855) 日期。返回该日期是当年的第几天。

1. 切割字符串
2. 使用日历类