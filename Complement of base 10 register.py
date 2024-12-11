class Solution(object):
    def bitwiseComplement(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        binary = bin(n)[2:]
        print(binary)
        binary  = str(binary)
        lst = []
        for i in range(len(binary)):
            lst.append(binary[i])
        print(lst)
        check = []
        for i in range(len(lst)):
            if(lst[i] == '1'):
                check.append('0')
            else:
                check.append('1')
        print(check)
        final = "".join(check)
        res = int(final,2)
        print(res)
        return res
