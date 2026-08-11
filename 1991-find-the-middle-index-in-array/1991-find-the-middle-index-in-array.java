class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            int j=n-1;
             right=prefix[j]-prefix[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}