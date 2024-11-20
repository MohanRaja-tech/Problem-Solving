class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        
        my_dict = {}
        for num in nums:
            if num in my_dict:
                my_dict[num] += 1
            else:
                my_dict[num] = 1


        sorted_dict = sorted(my_dict.items(), key=lambda item: item[1], reverse=True)


        lst = [item[0] for item in sorted_dict[:k]]
        return lst
