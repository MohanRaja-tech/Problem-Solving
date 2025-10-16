class Solution {
    public String convert(String s, int numRows) {
        int n = numRows;
        if (n == 1 || s.length() <= n) return s;
        
        List<StringBuilder> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(new StringBuilder());
        }

        boolean goingdown = true;
        int limit_count = 0;

        for (char ch : s.toCharArray()) {
            lst.get(limit_count).append(ch);

            if (goingdown) {
                limit_count++;
            } else {
                limit_count--;
            }

            if (limit_count == n) {  
                goingdown = false;
                limit_count = n - 2;
            } else if (limit_count < 0) {  
                goingdown = true;
                limit_count = 1;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sbs : lst) {
            result.append(sbs);
        }

        return result.toString();
    }
}
