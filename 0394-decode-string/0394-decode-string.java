class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stringstack = new Stack<>();
        Stack<Integer> countstack  = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0');
            }
            else if(ch == '['){
                countstack.push(k);
                stringstack.push(current);
                current = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder decoded = stringstack.pop();
                int repeat = countstack.pop();
                for(int i=0;i<repeat;i++){
                    decoded.append(current);
                }
                current = decoded;
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
        
    }
}