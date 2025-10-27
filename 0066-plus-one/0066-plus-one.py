class Solution(object):
    def plusOne(self, digits):  
        

        final = ""
        for i in range(len(digits)):
            final += str(digits[i])

        final = int(final) + 1
        final = str(final)

        lst = []
        for i in range(len(final)):
            lst.append(int(final[i]))
        return lst


        
            
        