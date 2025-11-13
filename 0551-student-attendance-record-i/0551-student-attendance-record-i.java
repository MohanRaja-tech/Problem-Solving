class Solution {
    public boolean checkRecord(String s) {
        boolean absent = false;
        boolean late = false;
        int acount = 0;
        int lcount = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 == 'L' && ch2 == 'L'){
                lcount++;
            }
            if(ch1 != 'L'){
                max = Math.max(max,lcount);
                lcount = 1;  
            }
            if(ch1 == 'A'){
                acount++;
                if(acount >= 2){
                    absent = true;
                }
            }
        }
       
        if(s.charAt(s.length()-1) == 'A'){
            acount++;
            if(acount >= 2){
                absent = true;
            }
        }
        
        max = Math.max(max, lcount);
        if(max >= 3){ 
            late = true;
        }
        if(!late && !absent){
            return true;
        }
        return false;
    }
}