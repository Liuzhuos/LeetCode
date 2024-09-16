/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 链表;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/16
 */
public class Leet1290 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null){
            res = (res << 1) + head.val;
            head = head.next;
        }
        return res;
    }
}
