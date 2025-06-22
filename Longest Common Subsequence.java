class Solution {
    public int f(int i,int j,String s,String t,int[][] dp){
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            dp[i][j] =  1+f(i-1,j-1,s,t,dp);
            return dp[i][j];
        }
        
        int left = f(i-1,j,s,t,dp);
        int right = f(i,j-1,s,t,dp);
        dp[i][j] = Math.max(left,right);
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }  
        int ans = f(text1.length()-1,text2.length()-1,text1,text2,dp);
        
        return ans;
    }
}
