# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseBetween(self, head, left, right):
        """
        :type head: ListNode
        :type left: int
        :type right: int
        :rtype: ListNode
        """
        lst = []
        temp = head
        left = left-1
        while(temp != None):
            lst.append(temp.val)
            temp = temp.next
        lst1 = lst[:left]+lst[left:right][::-1]+lst[right:]
        dummy = ListNode(0)
        current = dummy
        for i in lst1:
            current.next = ListNode(i)
            current = current.next
        return dummy.next


        
        
