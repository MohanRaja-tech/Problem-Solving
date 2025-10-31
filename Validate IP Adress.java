class Solution {
    public boolean isValid(String s) {
        // code here
        List<String> lst = new ArrayList<>();
        StringBuilder check = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch == '.'){
                lst.add(check.toString());
                check = new StringBuilder();
            }
            else{
                check.append(ch);
            }
        }
        lst.add(check.toString());
        
        if(lst.size() != 4){
            return false;
        }
        for(String str :  lst){
            if(str.length() == 0 || str.length() >  1 && str.charAt(0) == '0'){
                return false;
            }
            int num;
            try{
                num = Integer.parseInt(str);
            }
            catch(NumberFormatException e){
                return false;
            }
            if(num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }
}
