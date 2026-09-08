class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;

        mergesort(nums,0,n-1);
        return nums;

    }
    private void mergesort(int[] nums,int left,int right){
        if(left>=right){
            return ;
        }
        int middle=left+(right-left)/2;
        mergesort(nums,left,middle);
        mergesort(nums,middle+1,right);
        merge(nums,left,middle,right);
    }
    private void merge(int[] nums,int left,int middle,int right){
        int i=left;
        int j=middle+1;
        int k=0;
        int[] temp=new int[right-left+1];
        while(i<=middle&&j<=right){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
                k++;
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=middle){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[x+left]=temp[x];
        }
    }

}