class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int a=n-1;
        boolean next=true;
        while(a>=0&&next){
            if(digits[a]+1>9){
                digits[a]=0;
                next=true;
            }else{
       digits[a]+=1;
       next=false;
            }
            a--;
        }
        if(next){
            int[] prefix=new int[n+1];
            prefix[0]=1;
            return prefix;
        }
       return digits;
    }
}
