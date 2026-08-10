class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        int[] prefix=new int[arr.length];
                int[] ans=new int[n];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
         prefix[i]=prefix[i-1]^arr[i];
        }
        for(int i=0;i<n;i++){
            int a=queries[i][0];
            int b=queries[i][1];
          if(a==b){
            ans[i]=arr[b];
          }else if(a==0){
            ans[i]=prefix[b];
          }else{
            ans[i]=prefix[b]^prefix[a-1];
          }
        }
        return ans;
    }
}