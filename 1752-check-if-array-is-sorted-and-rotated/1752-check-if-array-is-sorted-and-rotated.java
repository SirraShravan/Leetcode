class Solution {
    public boolean check(int[] nums) {
         int falsecount=0;
         int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                falsecount++;
            }
    }
    if(nums[n-1]>nums[0]){
        falsecount++;
    }
    return falsecount<=1;
    }
}