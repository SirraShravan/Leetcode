class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq=new int[52];
       for(int k=0;k<word.length();k++){
        char ch=word.charAt(k);
        if(ch>='a'&&ch<='z'){
            freq[ch-'a']=k+1;
        }else{
            int idx=ch-'A'+26;
            if(freq[idx]==0){
             freq[ch-'A'+26]=k+1;

            }
        }
       }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0&&freq[i+26]!=0&&freq[i]<freq[i+26]){
                count++;
            }
        }
        return count;
    }
}