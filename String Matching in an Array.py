class Solution(object):
    def stringMatching(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        lst = []
        for i in range(len(words)):
            temp = words[i]
            temp_len = len(temp)
            for j in range(len(words)):
                if len(words[j]) <= temp_len:
                    continue
                else:
                
                    if temp in words[j]:
                        lst.append(temp)
                        break
        return lst
