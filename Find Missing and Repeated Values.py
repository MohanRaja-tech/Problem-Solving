class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[int]
        """
        one = []
        for i in grid:
            for j in i:
                one.append(j)

        Max = max(one)
        lst = []

        
        for i in range(len(one)):
            for j in range(i + 1, len(one)):
                if one[i] == one[j]:
                    lst.append(one[i])
                    break


        for i in range(1, Max + 1):
            if i not in one:
                lst.append(i)
                break

        
        if len(lst) == 1:
            lst.append(Max + 1)
        
        return lst
