class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=word.length();
           for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

           }
          List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());
               list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
               int count=0,size=1;
               for(Map.Entry<Character, Integer> e : list){
                if(size<=8){
                    count+=e.getValue();
                    
                }
                else if(size>8&&size<=16){
                    count+=e.getValue()*2;
                }
                else if(size>16&&size<=24){
                    count+=e.getValue()*3;
                }
                else{
                    count+=e.getValue()*4;
                }
                size++;
               }
           return count;
    }
}