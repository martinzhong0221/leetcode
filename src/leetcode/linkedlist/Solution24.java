package leetcode.linkedlist;

import leetcode.datastructure.ListNode;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	ListNode pre = null;
    	ListNode curr1 = head;
    	ListNode curr2 = head.next;
    	ListNode next;
    	ListNode finalHead = curr2;
    	while (curr1 != null && curr1.next!=null) {
        	next = curr2.next;
    		curr1.next = next;
    		curr2.next = curr1;

    		pre = curr1;
    			
    		curr1 = next;
    		curr2 = next.next;
    		
    		pre.next = curr1;
    	}
        return finalHead;
    }
    
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	ListNode node = new Solution24().swapPairs(node1);
    	System.out.println(node);
    	
	}
}
