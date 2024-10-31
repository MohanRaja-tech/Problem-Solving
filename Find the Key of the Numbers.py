class Solution(object):
    def generateKey(self, num1, num2, num3):
        """
        :type num1: int
        :type num2: int
        :type num3: int
        :rtype: int
        """
        n1 = str(num1)
        n2 = str(num2)
        n3 = str(num3)
        length1 = len(n1)
        length2 = len(n2)
        length3 = len(n3)
        while(length1 < 4):
            n1 = "0" + n1
            length1 += 1
        while(length2 < 4):
            n2 = "0" + n2
            length2 += 1
        while(length3  < 4):
            n3 = "0" + n3
            length3 += 1
        key = ""
        for i in range(4):
            key += str(min(int(n1[i]),int(n2[i]),int(n3[i])))
        return int(key)

