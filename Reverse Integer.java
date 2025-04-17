class Solution {
    public int reverse(int x) {
        String temp = Integer.toString(x);
        boolean isNegative = false;
        if(temp.charAt(0) == '-'){
            isNegative = true;
            temp = temp.substring(1);
        }
        StringBuilder sb =  new StringBuilder(temp);
        sb.reverse();
        String reversedstr = sb.toString();
        if(isNegative){
            reversedstr = '-' + reversedstr;
        }
        int result = 0;
        try{
            result = Integer.parseInt(reversedstr);
        }
        catch(NumberFormatException e){
            return 0;
        }

        return result;
    }
}
