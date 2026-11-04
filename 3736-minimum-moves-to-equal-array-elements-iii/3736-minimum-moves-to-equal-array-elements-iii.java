class Solution {
    public int minMoves(int[] nums) {
       
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
       
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=Math.abs(nums[i]-max);
        }
        return sum1;
    }
}