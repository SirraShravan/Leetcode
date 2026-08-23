class Solution {
    public int totalFruit(int[] fruits) {
     int n=fruits.length;
     int total=0,left=0;
    HashMap<Integer,Integer>map=new HashMap<>();

    for(int i=0;i<n;i++){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        while(map.size()>2){
            map.put(fruits[left],map.get(fruits[left])-1);
            if(map.get(fruits[left])==0){
                map.remove(fruits[left]);
                
            }
            left++;
        }
        int len=i-left+1;
        total=Math.max(len,total);
    }
    return total;
    }
}