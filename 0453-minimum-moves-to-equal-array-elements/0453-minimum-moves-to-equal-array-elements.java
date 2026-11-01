class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
                for(int i=0;i<n;i++){
                    if(nums[i]<min){
                        min=nums[i];
                    }
                }

       for(int i=0;i<n;i++){
            sum+=nums[i]-min;
       }
       return sum;
    }
   
}