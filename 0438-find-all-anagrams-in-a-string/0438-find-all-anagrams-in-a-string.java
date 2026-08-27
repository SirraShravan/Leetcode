class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        
    List<Integer>list=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            if(check(s.substring(i,i+k),p)){
            list.add(i);
            }

        }
return list;
    }
    private boolean check(String s,String p){
      int[] freq=new int[26];
      for(int i=0;i<p.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[p.charAt(i)-'a']--;

      }
      for(int x:freq){
        if(x!=0){
            return false;
        }
      }
        return true;
    }
}