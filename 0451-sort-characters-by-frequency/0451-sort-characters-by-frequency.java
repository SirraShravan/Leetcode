class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
       for(int i=0;i<s.length();i++){
        hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
       }
        PriorityQueue<Character>map=new PriorityQueue<>(
            (a,b)->hm.get(b)-hm.get(a)
        );
        map.addAll(hm.keySet());
        StringBuilder str=new StringBuilder();
        while(!map.isEmpty()){
            char ch=map.poll();
            for(int i=0;i<hm.get(ch);i++){
                str.append(ch);
            }
        }
    return str.toString();
    }
}