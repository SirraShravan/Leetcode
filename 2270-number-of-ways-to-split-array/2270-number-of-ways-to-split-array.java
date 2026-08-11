class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long total=0;
       
        for(int num:nums){
           total+=num;
        }
        int count=0;
       long left=0;
       for(int i=0;i<nums.length-1;i++){
        left+=nums[i];
        long right=total-left;
        if(left>=right){
            count++;
        }
       }
       return count;
    }
}