class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((j-i+1)%2==1){
               if(i==0){
                sum+=prefix[j];
               }else{
                sum+=prefix[j]-prefix[i-1];
               }


                }
            }
        }
        return sum;
    }
}