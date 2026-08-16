class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
     int[] dp=new int[n];
        int k=1;
        long sum=1;
        dp[0]=1;
        
     for(int i=1;i<n;i++){
        if((prices[i]-prices[i-1])==-1){
            k++;
            dp[i]=k;
            sum+=dp[i];
        }else{
            dp[i]=1;
            k=1;
            sum+=dp[i];
        }
     }

        return sum;
    }
}