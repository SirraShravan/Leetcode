class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int min=0;
     int lasa=-1,lasb=-1,lasc=-1;
        int ans=0;
        for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          if(ch=='a'){
            lasa=i;
          }else if(ch=='b'){
            lasb=i;
          }
          else{
            lasc=i;
          }
        min=Math.min(lasa,Math.min(lasb,lasc));
        if(min!=-1){
            ans+=min+1;
        }
        }
        return ans;
    }
}