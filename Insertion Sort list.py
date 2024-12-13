# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        lst = []
        temp = head


        while temp is not None:
            lst.append(temp.val)
            temp = temp.next


        for i in range(1, len(lst)):
            key = lst[i]
            j = i - 1
            while j >= 0 and key < lst[j]:
                lst[j + 1] = lst[j]
                j -= 1
            lst[j + 1] = key

        
        dummy = ListNode(0)
        current = dummy
        for val in lst:
            current.next = ListNode(val)
            current = current.next

        return dummy.next
