class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
      int[] arr1=new int[100];
      int[] arr2=new int[100];
      int i=0,k=0;
      arr1[0]=nums[0];
      arr2[0]=nums[1];
      for(int j=2;j<n;j++){
         if(arr1[i]>arr2[k]){
            arr1[++i]=nums[j];
         }else{
            arr2[++k]=nums[j];
         }
      }
     int pos=0;
     for(int j=0;j<=i;j++){
        nums[pos++]=arr1[j];
     }
     for(int j=0;j<=k;j++){
        nums[pos++]=arr2[j];
     }
     
        return nums;
    }
}