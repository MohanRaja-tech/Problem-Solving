class Solution {
    public String strWithout3a3b(int a, int b) {
        List<Character> lst = new ArrayList<>();
        while(a > 0 || b  > 0){
            int size = lst.size();
            boolean addA = false;
            if(lst.size() >= 2 && (lst.get(size-2) == lst.get(size-1))){
                if(lst.get(size-1) == 'a'){
                    addA = false;
                }
                else{
                    addA = true;
                }
            }
            else{
                addA = a >= b;
            }
            if(addA && a > 0){
                lst.add('a');
                a--;
            }
            else if(!addA && b > 0){
                lst.add('b');
                b--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : lst){
            sb.append(ch);
        }
        return sb.toString();
    }
}
