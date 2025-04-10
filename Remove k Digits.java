class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilader();
        for(char ch : stack){
            sb.append(ch);
        }
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length() > 0 ? sb.toString() : "0";

    }
}
