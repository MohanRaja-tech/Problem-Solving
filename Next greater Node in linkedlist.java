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
    public int helper(ListNode head,int target){
        ListNode temp = head;
        while(temp != null){
            if(temp.val > target){
                return temp.val;
            }
            temp = temp.next;
        }
        return 0;
    }
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            int result = helper(temp,temp.val);
            lst.add(result);
            temp = temp.next;
            
        }
        int[] arr = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}
