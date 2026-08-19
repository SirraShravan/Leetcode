class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
       for(int i=n-2;i>=0;i--){
      if(nums[i]<nums[i+1]){
        pivot=i;
        break;
      }
       }
       if(pivot==-1){
        reverse(nums,0,n);
        return ;
       }
       for(int i=n-1;i>pivot;i--){
        if(nums[i]>nums[pivot]){
            int temp=nums[pivot];
            nums[pivot]=nums[i];
            nums[i]=temp;
            break;
        }
       }
       int i=pivot+1,j=n-1;
       while(i<=j){
        int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
       }

    }
    private void reverse(int[] nums,int s,int n){
        int i=s,j=n-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

}