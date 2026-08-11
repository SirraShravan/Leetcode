class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
         map.put(0,-1);
         
         int prefix=0,maxlength=0;
         for(int i=0;i<n;i++){
            if(nums[i]==0){
                prefix-=1;
            }else{
                prefix+=1;
            }
            if(map.containsKey(prefix)){
          int length=i-map.get(prefix);
          maxlength=Math.max(length,maxlength);
            }else{
                map.put(prefix,map.getOrDefault(prefix,i));
            }
         }
     return maxlength;
    }
}