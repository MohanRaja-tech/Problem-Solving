class Solution {
    public boolean helper(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public boolean hasSameDigits(String s) {
      boolean flag = true;
      String temp = s;
      while(flag){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<temp.length();i++){
            int num1 = temp.charAt(i-1) - '0';
            int num2 = temp.charAt(i) - '0';
            int result = (num1+num2)%10;
            //System.out.println(result);
            sb.append(Integer.toString(result));
        }
        System.out.println(sb);
        temp = sb.toString();
        if(temp.length() == 2){
            if(helper(temp)){
                return true;
                
            }
            else{
                return false;
            }
        }
      }
    return false;
    }
}