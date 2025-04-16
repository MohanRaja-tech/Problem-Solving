class Solution {
    public int passThePillow(int n, int time) {
        boolean forward = true;
        int ref = 1;
        while(time > 0){
            if(forward){
                ref++;
                if(ref == n){
                    forward = false;
                }
            }
            else{
                ref--;
                if(ref == 1){
                    forward = true;
                }
            }
            time--;
        }
    
        return ref;
    }
}
