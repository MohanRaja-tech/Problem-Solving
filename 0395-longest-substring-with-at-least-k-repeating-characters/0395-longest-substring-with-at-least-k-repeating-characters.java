import java.util.HashMap;

class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k > s.length()) return 0;

        int maxLen = 0;

    
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (isValid(map, k)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

   
    private boolean isValid(HashMap<Character, Integer> map, int k) {
        for (int count : map.values()) {
            if (count < k) return false;
        }
        return true;
    }
}
