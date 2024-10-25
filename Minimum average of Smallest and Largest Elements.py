class Solution(object):
    def minimumAverage(self, nums):
        """
        :type nums: List[int]
        :rtype: float
        """
        avg = []
        nums.sort()
        l = int(len(nums)/2)
        for i in range(l):
            a = nums.pop(0)
            b = nums.pop()
            avg.append((a+b)/2.0)
        return min(avg)


        
