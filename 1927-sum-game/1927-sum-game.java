class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int lsum=0,rsum=0,lcount=0,rcount=0;
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
      if(i<n/2){
         if(ch=='?'){
        lcount++;
       }else{
        lsum+=(ch-'0');
       }
      }else{
          if(ch=='?'){
        rcount++;
       }else{
        rsum+=(ch-'0');
       }
      }
        }
        return (lsum-rsum)!=(9*(rcount-lcount)/2)||(lcount+rcount)%2==1;
    }
}