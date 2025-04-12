class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] max_len = new int[26];
        int curr_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) + 26) % 26 == 1) {
                curr_len++;
            } else {
                curr_len = 1;
            }

            int idx = s.charAt(i) - 'a';
            max_len[idx] = Math.max(max_len[idx], curr_len);
        }

        int result = 0;
        for (int len : max_len) {
            result += len;
        }

        return result;
    }
}
