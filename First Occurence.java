class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        if(txt.length() == pat.length()){
            if(txt.equals(pat)){
                return 0;
            }
        }
        int index = 0;
        for(int i=0;i<=txt.length()-pat.length();i++){
            String temp = txt.substring(i,i+pat.length());
            if(temp.equals(pat)){
                return i;
            }
        }
        return -1;
    }
}
