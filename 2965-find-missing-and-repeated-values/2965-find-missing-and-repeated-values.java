class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
             int n=grid.length;
             int[] freq=new int[n*n+1];
             for(int[] row:grid){
                for(int num:row){
                    freq[num]++;
                }
             }
             int repeat=0, miss=0;
             for(int i=1;i<=n*n;i++){
                if(freq[i]==2){
                    repeat=i;
                }else if(freq[i]==0){
                    miss=i;
                }
             }
          return new int[]{repeat,miss};
    }
}