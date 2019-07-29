package leetcode.linkedlist;

import leetcode.datastructure.ListNode;

/**
 *反转一个单链表。
 * @author Zhong Xiaoyu
 * 2019年7月27日
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	//迭代法
        ListNode pre = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null) {
        	//把下一个节点指针往后移动
        	next = curr.next;
        	//当前节点的后继指向前一个节点。
        	curr.next = pre;
        	//把前一个节点指针往后移动
        	pre = curr;
        	//把当前节点指针移动往后移动
        	curr = next;

        }
        return pre;
    }
    
    public ListNode reverseList1(ListNode head) {
    	if(head ==null ||head.next == null) return head;
    	ListNode node = reverseList1(head.next);
    	head.next.next = head;
    	head.next = null;
    	return node;
    }
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	node1.next = node2;
    	node2.next = node3;
    	new Solution206().reverseList1(node1);
	}
}
