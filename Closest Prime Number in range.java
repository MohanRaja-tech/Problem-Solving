class Solution {
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
        }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                lst.add(i);
            }
        }
        if(lst.size() == 0){
            return new int[] {-1,-1};
        }
        // reference
        for(int num : lst){
            System.out.print(num);
        }
        
        int[] result = {-1,-1};
        
        

        int mindiff = Integer.MAX_VALUE;
        for(int i=1;i<lst.size();i++){
            int diff = Math.abs(lst.get(i-1)-lst.get(i));
            if(diff < mindiff){
                mindiff = diff;
                result[0] = lst.get(i-1);
                result[1] = lst.get(i);
                
            }
        }
        
      
       return result; 
    }
}
