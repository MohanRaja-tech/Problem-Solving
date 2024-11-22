# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        temp = head
        lst = []
        
        while temp is not None:
            lst.append(temp.val)
            temp = temp.next
        
        print(lst)
        
        final = []

        while len(lst) >= k:
            final.extend(lst[:k][::-1])
            lst = lst[k:]
        

        final.extend(lst)
        

        dummy = ListNode(0)
        current = dummy
        for val in final:
            current.next = ListNode(val)
            current = current.next
        
        return dummy.next
