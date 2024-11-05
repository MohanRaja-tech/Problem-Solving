# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        temp = head
        lst = []
        while(temp != None):
            lst.append(temp.val)
            temp = temp.next
        index = len(lst)-n
        del lst[index]
        dummy = ListNode(0)
        current = dummy
        for i in lst:
            current.next = ListNode(i)
            current= current.next
        return dummy.next

        
