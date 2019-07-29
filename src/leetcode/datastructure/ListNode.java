package leetcode.datastructure;


/**
 * 列表节点
 * @author Zhong Xiaoyu
 * 2019年7月27日
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    
	@Override
	public String toString() {
		ListNode node = this;
		StringBuilder sb = new StringBuilder("[");
		while(node != null) {
			sb.append(node.val+",");
			node = node.next;
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
    
}
