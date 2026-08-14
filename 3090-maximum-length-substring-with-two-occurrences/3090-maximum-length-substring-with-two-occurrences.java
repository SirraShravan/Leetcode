class Solution {
    public int maximumLengthSubstring(String s) {
      int[] freq=new int[26];
      int left=0,maxlen=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
        while(freq[ch-'a']>2){
            char leftchar=s.charAt(left);
            freq[leftchar-'a']--;
            left++;
        }
        int len=i-left+1;
        maxlen=Math.max(len,maxlen);
      }
      return maxlen;
    }
}