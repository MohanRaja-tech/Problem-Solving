class Solution {
    public boolean checkDivisibility(int n) {
       int og=n;
       int sum=0;
       int product=1;
        while(n!=0){
          int rem=n%10;
          sum+=rem;
          product*=rem;
          n/=10;
        }
        int ans=sum+product;
        if(og%ans==0){
            return true;
        }
        return false;
    }
}