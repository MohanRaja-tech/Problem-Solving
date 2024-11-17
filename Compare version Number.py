class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        version1 = version1.split('.')
        version2 = version2.split('.')

        max_length = max(len(version1), len(version2))
        version1 += ['0'] * (max_length - len(version1))
        version2 += ['0'] * (max_length - len(version2))

       
        for i in range(max_length):
            part1 = int(version1[i])
            part2 = int(version2[i])
            if part1 < part2:
                return -1
            elif part1 > part2:
                return 1

        
        return 0
