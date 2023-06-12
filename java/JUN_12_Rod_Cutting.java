// Rod Cutting - 12 June

class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int dp[][]=new int[n][n+1];

        for(int row[]:dp)
        Arrays.fill(row,-1);
    
        for(int i=0; i<=n; i++){
            dp[0][i] = i*price[0];
        }
    
        for(int ind=1; ind<n; ind++){
            for(int length =0; length<=n; length++){
    
                 int notTaken = 0 + dp[ind-1][length];
    
                 int taken = Integer.MIN_VALUE;
                 int rodLength = ind+1;
                 if(rodLength <= length)
                    taken = price[ind] + dp[ind][length-rodLength];
    
                 dp[ind][length] = Math.max(notTaken,taken);   
            }
        }
        return dp[n-1][n];
    }
}