class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=Math.abs(nums[i]-nums[n-1]);
        }
        return sum1;
    }
}