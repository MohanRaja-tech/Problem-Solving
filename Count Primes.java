class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        for(int i=0;i<primes.length;i++){
            primes[i] = true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]){
                for(int j=i*2;j<n;j+=i){
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<primes.length;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}
