class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = max(nums)
        Sum = 0
        for i in range(len(nums)):
            Sum += nums[i]
            ans = max(ans,Sum)
            if(Sum < 0):
                Sum = 0
        return ans

            

        
