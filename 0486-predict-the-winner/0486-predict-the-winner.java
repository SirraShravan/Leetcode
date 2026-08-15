class Solution {
    
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
       int play1=solve(0,n-1,nums);
       int play2=sum-play1;
       return play1>=play2;
    }
    private int solve(int i,int j,int[] nums){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        
        int p1=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int p2=nums[j]+Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return Math.max(p1,p2);
    }
}