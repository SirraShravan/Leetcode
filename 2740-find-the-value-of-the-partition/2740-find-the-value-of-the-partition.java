class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int diff=Math.abs(nums[i]-nums[j]);
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
}