class Solution {
    public int minStartValue(int[] nums) {
        int ans=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
       sum+=nums[i];
       if(sum<1){
        ans=Math.max(ans,Math.abs(sum)+1);
       }
        }
        return ans;
    }
}