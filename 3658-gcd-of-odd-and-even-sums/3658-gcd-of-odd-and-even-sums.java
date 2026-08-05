class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        int a=odd;
        while(a>=1){
            if(even%a==0&&odd%a==0){
                return a;
            }
            a--;
        }
        return -1;
    }
}