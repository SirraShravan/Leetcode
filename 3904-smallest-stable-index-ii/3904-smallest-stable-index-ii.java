class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefMax=new int[n];
        int[] suffMin=new int[n];
        int min=Integer.MAX_VALUE;
        int idx=-1;
         if(n<=1){
            return 0;
        }
        prefMax[0]=nums[0];
        suffMin[n-1]=nums[n-1];
       
        for(int i=1;i<n;i++){
            
            prefMax[i]=nums[i]>prefMax[i-1]?nums[i]:prefMax[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffMin[i]=nums[i]<suffMin[i+1]?nums[i]:suffMin[i+1];
        }
        for(int i=0;i<n;i++){
            int st=prefMax[i]-suffMin[i];
            if(st<=k){
                return i;
                
            }
        }
        return -1;
    }
}