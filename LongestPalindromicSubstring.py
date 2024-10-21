class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if(len(s) <= 1):
            return s
        n = len(s)
        max_len = 1
        start = 0
        end = 0
        for i in range(n-1):
            left = i
            right = i
            while(left >= 0 and right < n):
                if(s[left] == s[right]):
                    left = left-1
                    right = right+1
                else:
                    break
            _len = right-left-1
            if(_len > max_len):
                max_len = _len
                start = left+1
                end = right-1
        for i in range(n-1):
            left = i
            right = i+1
            while(left >= 0 and right < n):
                if(s[left] == s[right]):
                    left = left-1
                    right = right+1
                else:
                    break
            _len = right-left-1
            if(_len > max_len):
                max_len = _len
                start = left+1
                end = right-1

        return s[start:end+1]
            
        
            
        
