class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        double sum=0;
      for(int i=0;i<k;i++){
     sum+=nums[i];
      }
      double ans=sum;
      for(int i=k;i<nums.length;i++){
        sum+=nums[i];
        sum-=nums[i-k];
        ans=Math.max(sum,ans);
      }
      return ans/=(double)k;

    }
}