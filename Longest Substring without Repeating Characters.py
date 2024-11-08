class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = 0
        Max_length = 0
        current_substr = []
        while(i < len(s)):
            if(s[i] not in current_substr):
                current_substr.append(s[i])
                Max_length = max(Max_length,len(current_substr))
                i += 1
            else:
                if(s[i] in current_substr):
                    current_substr.pop(0)
        return Max_length
            
        
