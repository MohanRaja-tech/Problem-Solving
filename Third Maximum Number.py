class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lst = []
        for i in nums:
            if i not in lst:
                lst.append(i)
        print(lst)
        

        lst.sort(reverse=True)
        
        
        if len(lst) < 3:
            return lst[0]
        else:

            return lst[2]
