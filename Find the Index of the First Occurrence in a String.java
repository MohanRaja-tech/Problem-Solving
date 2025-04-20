class Solution {
    public int strStr(String haystack, String needle) {
        List<Character> lst = new ArrayList<>();
        for(char ch : haystack.toCharArray()){
            lst.add(ch);
        }
        String suffix = needle;
        int index = 0;
        int result = -1;
        if(haystack.length() == 1 && suffix.length() ==1 && haystack.equals(suffix)){
            return 0;
        }
        while(index < haystack.length()){
            StringBuilder temp = new StringBuilder();
            for(char ch : lst){
                temp.append(ch);
            
            }
            if(temp.toString().startsWith(suffix)){
                result = index;
                break;
            }
            else{
                lst.remove(0);
                index++;
            }
            
        }
        return result;
    }

}
