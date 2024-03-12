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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> mp=new HashMap<>();
        ListNode pervious=new ListNode(0);
        pervious.next=head;
        mp.put(0,pervious);
        int persum=0;
        while(head!=null){
            persum+=head.val;
            if(!mp.containsKey(persum)){
                mp.put(persum,head);
            }else{
                ListNode start=mp.get(persum);
                ListNode curr=start;
                int sum=persum;
                while(curr!=head){
                    curr=curr.next;
                    sum+=curr.val;
                    if(curr!=head){
                        mp.remove(sum);
                    }
                }
                start.next=head.next;
            }
            head=head.next;
        }
        return pervious.next;
    }
}