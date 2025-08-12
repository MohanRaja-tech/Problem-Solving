class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack = new Stack<>();
        Stack<StringBuilder> stringstack = new Stack<>();
        int k = 0;
        StringBuilder current = new StringBuilder();
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
                for(int i=1;i<=repeat;i++){
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
