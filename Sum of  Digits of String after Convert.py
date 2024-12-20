class Solution(object):
    def getLucky(self, s, k):
        dict1 = {chr(i): i - ord('a') + 1 for i in range(ord('a'), ord('z') + 1)}
        final = "".join(str(dict1[char]) for char in s)
        for _ in range(k):
            final = str(sum(int(digit) for digit in final))
        return int(final)
