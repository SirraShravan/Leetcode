class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        for(int right=n-1;right>=0;right--){
            if(nums[right]>0){
                for(int j=0;j<n;j++){
                    if(nums[j]==-nums[right]){
                        return nums[right];
                    }
                }
            }
        }
        return -1;
    }
}