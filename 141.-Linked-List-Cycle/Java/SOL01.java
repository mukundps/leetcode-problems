/**
* Definition for singly-linked list.
* class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
  public boolean hasCycle(ListNode head) {
    HashSet<ListNode> nodeHash = new HashSet<>();

    while(head != null){
      if(nodeHash.contains(head))
        return true;
      nodeHash.add(head);
      head = head.next;
    }
    
    return false;
  }
}
