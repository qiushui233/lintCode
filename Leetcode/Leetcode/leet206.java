package Leetcode;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class leet206 {
    public ListNode reverseList(ListNode head){   //递归调用
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode p = head.next;
        ListNode n = reverseList(p);

        head.next = null;
        p.next = head;

        return n;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}