class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
       int zcount=0;
       int max=0;
       int left=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            zcount++;

        }
       while(zcount>k){
        if(nums[left]==0){
            zcount--;
        }
        left++;
       }
max=Math.max(max,i-left+1);
       }

return max;
    }
}