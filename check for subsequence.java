class Solution {
    int helper(int index, String str, char ch) {
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i; 
            }
        }
        return -1; 
    }

    boolean isSubSequence(String A, String B) {
        int move_index = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int res_index = helper(move_index, B, ch);
            if (res_index == -1) {
                return false;
            }
            move_index = res_index + 1; 
        }
        return true; 
    }
}
