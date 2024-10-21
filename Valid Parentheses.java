import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;

        
        if (s.length() == 0) {
            return true;
        }


        while (idx < s.length()) {

            if (s.charAt(idx) == '(' || s.charAt(idx) == '[' || s.charAt(idx) == '{') {
                stack.push(s.charAt(idx));
            }

            else if ((s.charAt(idx) == ')' && !stack.isEmpty() && stack.peek() == '(') ||
                     (s.charAt(idx) == '}' && !stack.isEmpty() && stack.peek() == '{') ||
                     (s.charAt(idx) == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                stack.pop();
            } else {
                
                return false;
            }

            idx++;
        }

        
        return stack.isEmpty();
    }
}
