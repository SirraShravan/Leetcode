class Solution {
    public int maxVowels(String s, int k) {
      int n=s.length();
      int count=0;
      
      StringBuffer s1=new StringBuffer();
      for(int i=0;i<k;i++){
                char ch=s.charAt(i);

        if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
            count++;
        }
      }
      int ans=count;
      for(int i=k;i<n;i++){
        char ch1=s.charAt(i);
        char ch2=s.charAt(i-k);
         if(ch1=='a'||ch1=='i'||ch1=='o'||ch1=='e'||ch1=='u'){
            count++;
        }
      if(ch2=='a'||ch2=='i'||ch2=='o'||ch2=='e'||ch2=='u'){
            count--;
        }
        ans=Math.max(ans,count);
      }
      return ans;
    }
}