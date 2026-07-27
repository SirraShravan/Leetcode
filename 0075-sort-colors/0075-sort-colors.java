class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
    int count0=0,count1=0,count2=0;
    for(int num:nums){
        if(num==0){
            count0++;
        }else if(num==1){
            count1++;
        }else{
            count2++;
        }
    }
  for(int i=0;i<n;i++){
    if(i<count0){
        nums[i]=0;
    }else if(i<count0+count1){
        nums[i]=1;
    }else{
        nums[i]=2;
    }
  }
    }
}