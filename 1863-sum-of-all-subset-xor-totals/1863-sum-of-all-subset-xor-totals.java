class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int xor=0;
       for(int i=0;i<n;i++){
        xor|=nums[i];
       }
     return (xor)*(1<<(nums.length-1));
    }
}