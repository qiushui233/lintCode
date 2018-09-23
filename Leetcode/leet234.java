package Leetcode;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class leet234 {
    public boolean isPalindrome(ListNode head) {

        int num=1;
        if(head==null)
        {
            return true;
        }
        ListNode temp=head;
        if(head.next==null)
        {
            return true;
        }
        while(temp.next!=null)
        {
            num++;
            temp=temp.next;
        }
        // System.out.println(num);
        if(num%2!=0)
        {
            int arr[]=new int[num/2+1];
            for(int i=0;i<num/2;i++)
            {
                arr[i]=head.val;
                head=head.next;
            }
            head=head.next;
            for(int j=num/2-1;j>=0;j--)
            {
                if(arr[j]!=head.val)
                {
                    return false;
                }
                else
                {
                    head=head.next;
                }
            }
            return true;
        }
        else
        {
            int arr[]=new int[num/2];
            for(int i=0;i<num/2;i++)
            {
                arr[i]=head.val;
                head=head.next;
            }
            for(int j=num/2-1;j>=0;j--)
            {
                if(arr[j]!=head.val)
                {
                    return false;
                }
                else
                {
                    head=head.next;
                }
            }
            return true;
        }
    }

}


