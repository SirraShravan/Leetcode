class Solution {
    public int maximumDifference(int[] nums) {

        int ans=-1;
        int n=nums.length;
        int min=nums[0];
       for(int i=1;i<n;i++){
        if(nums[i]<=min){
            min=nums[i];
        }else{
            ans=Math.max(ans,nums[i]-min);
        }
       

       }
       return ans;
    }
}