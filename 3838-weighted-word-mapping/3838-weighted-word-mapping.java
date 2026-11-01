class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        HashMap<Integer,Character>map=new HashMap<>();
        int start=0;
        for(char ch='z';ch>='a';ch--){
            map.put(start++,ch);
        }
        int m=words.length;
        for(String word:words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                sum+=weights[word.charAt(i)-'a'];
            }
            sum%=26;
    s.append(map.get(sum));
        }
        return s.toString();
    }
}