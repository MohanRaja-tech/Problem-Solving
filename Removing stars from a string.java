class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            
        }
        StringBuilder str = new StringBuilder();
        for(int i=stack.size()-1;i>=0;i--){
            str.append(stack.get(i));
            
        }
        
        return str.reverse().toString();
        
        
    }
}
