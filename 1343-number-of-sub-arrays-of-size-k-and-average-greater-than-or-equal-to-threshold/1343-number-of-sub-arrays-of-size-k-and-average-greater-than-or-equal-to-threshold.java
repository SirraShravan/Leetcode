class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        int count=0;
int a=threshold*k;
        for(int i=0;i<k;i++){
     sum+=arr[i];
     

        }
        if(sum>=a){
     count++;
        }
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>=a){
                count++;
            }
        }
        return count;
    }
}