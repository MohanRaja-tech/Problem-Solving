class Solution {

    public char helper(char target) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (c != target) {
                return c;
            }
        }
        return 'a';
    }

    public char helper2(char prev, char next) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (c != prev && c != next) {
                return c;
            }
        }
        return 'a';
    }

    public String modifyString(String s) {

        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                char insert;
                if (i == 0) {
                    if (i + 1 < arr.length) {
                        char next = arr[i + 1];
                        insert = helper(next);
                    } else {
                        insert = 'a';
                    }
                }
                else if (i > 0 && i + 1 < arr.length) {
                    char prev = sb.charAt(i - 1);
                    char next = arr[i + 1];
                    insert = helper2(prev, next);
                }
                else {
                    char prev = sb.charAt(i - 1);
                    insert = helper(prev);
                }

                sb.append(insert);
                arr[i] = insert; 

            } else {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
