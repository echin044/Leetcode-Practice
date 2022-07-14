/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //base cases
        if(l1 == null&& l2 == null){
              return null;
        }
        
        if(l1 == null){
            if(l2.val<10)
              return new ListNode(l2.val, addTwoNumbers(null, l2.next));
            else
            {
                if(l2.next!=null){
                l2.next.val+=l2.val/10;
                return new ListNode(l2.val%10, addTwoNumbers(null, l2.next));
                }
                else
                    return new ListNode(l2.val%10, new ListNode(l2.val/10));
            }
        }
        if(l2 == null){
             if(l1.val<10)
               return new ListNode(l1.val, addTwoNumbers(l1.next, null));
            else
            {
                if(l1.next!=null)
                {
                l1.next.val+=l1.val/10;
                return new ListNode(l1.val%10, addTwoNumbers(null, l1.next));
                }
                else 
                    return new ListNode(l1.val%10, new ListNode(l1.val/10));
            }
        }
        
        
        //two cases: with and without carrying
        if(l1.val+l2.val<10){
            return new ListNode(l1.val+l2.val, addTwoNumbers(l1.next, l2.next));
        }
        else{
            
            if(l1.next != null){
            l1.next.val+= (l1.val+l2.val)/10;
            }
            else if(l2.next!=null)
            {
                l2.next.val+= (l1.val+l2.val)/10;
            }
                else
            {
                return new ListNode((l1.val+l2.val)%10, new ListNode((l1.val+l2.val)/10));
            }
            
            return new ListNode((l1.val+l2.val)%10 , addTwoNumbers(l1.next , l2.next));
        }
    }
}