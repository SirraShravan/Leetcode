class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int a=n;
        while(a>0){
            sum+=a%10;
            prod*=a%10;
            a/=10;
            
        }
        return n%(sum+prod)==0;
    }
}