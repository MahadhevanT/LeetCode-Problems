class Solution {
    public int uniquePaths(int m,int n) {
        
        int [][]dp=new int[n][m];
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                    dp[i][j]=1;
                else if(i==dp.length-1)// last row
                   dp[i][j]=dp[i][j+1];
                else if(j==dp[0].length-1) //last col
                    dp[i][j]=dp[i+1][j];
                else
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }   
        }
        return dp[0][0];
}
}