class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<3;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==3){
            ans++;
        }
        for(int i=3;i<n;i++){
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
          int count=map.get(s.charAt(i-3));
          if(count==1){
            map.remove(s.charAt(i-3));
          }else{
            map.put(s.charAt(i-3),count-1);

          }
          if(map.size()==3){
            ans++;
          }
        }
        return ans;
    }
}