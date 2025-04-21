class Solution {
    public int punishmentNumber(int n) {
        int sum= 0;
        for(int i=1;i<=n;i++){
            int square = i*i;
            String sqrstr = Integer.toString(square);
            if(check_partition(sqrstr,0,i)){
                sum += square;
            }
            
        }
        return sum;
    }



    public boolean check_partition(String sqrstr,int start,int target){
        
        if(sqrstr.length() == start){
            if(target == 0){
                return true;
            }
            else{
                return false;
            }
        }


        for(int end = start+1;end<=sqrstr.length();end++){
            String temp = sqrstr.substring(start,end);
            int num = Integer.parseInt(temp);
            if(check_partition(sqrstr,end,target-num)){
                return true;
            }
        }
        return false;
    }
}
