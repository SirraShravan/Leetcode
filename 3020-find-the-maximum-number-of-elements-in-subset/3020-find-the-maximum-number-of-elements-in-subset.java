class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put((long)nums[i],map.getOrDefault((long)nums[i],0)+1);
        }
        int count=1;
        if(map.containsKey(1L)){
            int cnt=map.get(1L);
            count=cnt-((cnt%2==0)?1:0);
            map.remove(1L);
        }
        for(long start:map.keySet()){
           long x=start;
           int len=0;
           while(map.getOrDefault(x,0)>=2){
            len+=2;
            x=x*x;
           }
           if(map.getOrDefault(x,0)==1){
            len+=1;
           }else{
            len-=1;
           }
           count=Math.max(count,len);
        }
        return count;
    }
}