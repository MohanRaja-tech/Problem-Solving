class Solution(object):
    def countEven(self, num):
        """
        :type num: int
        :rtype: int
        """
        lst = []
        for i in range(1, num + 1):
            if len(lst) == 0:
                if i % 2 == 0:
                    lst.append(i)
            else:
                if len(str(i)) == 1:
                    if i % 2 == 0:
                        lst.append(i)
                else:
                    i_str = str(i)
                    final = []
                    for j in i_str:
                        final.append(int(j))
                    if sum(final) % 2 == 0:
                        lst.append(i)
        return len(lst)
