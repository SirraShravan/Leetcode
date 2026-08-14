class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
HashMap<Integer,Integer>map=new HashMap<>();

        int left=0,maxlen=0;
        for(int i=0;i<n;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          while(map.get(nums[i])>k){
            int leftnt=nums[left];
            map.put(leftnt,map.get(leftnt)-1);
            left++;
          }
          int len=i-left+1;
          maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}