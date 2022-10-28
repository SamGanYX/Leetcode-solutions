class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake  = new ListNode(0);
        ListNode cur = fake;
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
	//traverse through cur1 list if not null
         int carry = 0;
        while(cur1!= null || cur2!= null) {
            int sum = carry;
            if(cur1 != null) {
                sum += cur1.val;
                cur1 = cur1.next;
            }
         //traverse through cur2 list if not null   
            if(cur2 != null) {
                sum += cur2.val;
                cur2 = cur2.next;
            }
            //if the sum is less than 9 carry becomes 1 and sum is subtracted by 10
            if (sum>9) {
                carry = 1;
                sum = sum - 10;
            }
            else{
                carry = 0;
            }
            //make a new list of sum
            ListNode l = new ListNode(sum);
            cur.next = l;
            cur = cur.next;
            }
        
        if(carry > 0){
            ListNode l = new ListNode(carry);
            cur.next = l;
        }
        return fake.next;
    }
}
