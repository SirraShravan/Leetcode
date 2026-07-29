class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:text.toCharArray()){
               map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq1=map.getOrDefault('b',0);
        int freq2=map.getOrDefault('a',0);
        int freq3=map.getOrDefault('l',0);
        int freq4=map.getOrDefault('o',0);
        int freq5=map.getOrDefault('n',0);
        while(freq1>0){
        if(freq1<=freq3/2&&freq1<=freq2&&freq1<=freq4/2&&freq1<=freq5){
            return freq1;
        }
        freq1--;
        }
        return 0;
    }
}