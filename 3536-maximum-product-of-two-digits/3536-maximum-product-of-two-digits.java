class Solution {
    public int maxProduct(int n) {
        int s=0;
        int a=n;
        while(a>0){
         s++;
         a/=10;
        }
        int[] arr=new int[s];
          for(int i=0;i<s;i++){
            arr[i]=n%10;
            n/=10;
          }
          Arrays.sort(arr);
          return arr[s-1]*arr[s-2];
    }
}