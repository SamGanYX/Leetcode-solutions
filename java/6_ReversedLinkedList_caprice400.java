class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = n;
            n = head;
            head = next;
            
        }
        return n;
            
            
        
        
    }
}
