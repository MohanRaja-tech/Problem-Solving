import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        List<Integer> lst = new ArrayList<>();
        while(temp != null){
            lst.add(temp.val);
            temp = temp.next;
        }
        int remove_index = lst.size()-n;
        lst.remove(remove_index);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int num : lst){
            current.next  = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i=0;i<=n;i++){
            int num = sc.nextInt();
            current.next = new ListNode(num);
            current = current.next;
        }
        ListNode head = dummy.next;
        Solution obj = new Solution();
        ListNode resulthead = obj.removeNthFromEnd(head,2);
        ListNode temp = resulthead;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
