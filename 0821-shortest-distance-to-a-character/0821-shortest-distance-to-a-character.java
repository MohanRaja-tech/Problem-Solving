class Solution {

    public int helper(String s, char ch, int idx) {
        char[] arr = s.toCharArray();
        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] == ch)
                return Math.abs(idx - i);
        }
        return Integer.MAX_VALUE;
    }

    public int helper2(String s, char ch, int idx) {
        char[] arr = s.toCharArray();
        for (int i = idx - 1; i >= 0; i--) {
            if (arr[i] == ch)
                return Math.abs(idx - i);
        }
        return Integer.MAX_VALUE;
    }

    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                lst[i] = 0;
                continue;
            }
            lst[i] = Math.min(lst[i], helper(s, c, i));
        }

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                lst[i] = 0;
                continue;
            }
            lst[i] = Math.min(lst[i], helper2(s, c, i));
        }

        return lst;
    }
}
