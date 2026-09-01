class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        int m=s.length();
        if(n!=m){
            return false;
        }
        int left=0;
        for(String str:words){
     if(str.charAt(0)!=s.charAt(left)){
        return false;
     }
     left++;
        }
        return true;
    }
}