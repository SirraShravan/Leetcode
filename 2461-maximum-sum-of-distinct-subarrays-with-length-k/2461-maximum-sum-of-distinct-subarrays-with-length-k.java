class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0,maxsum=0;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
            maxsum=sum;
        }
        
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
           
            int count = map.get(nums[i-k]);

if(count == 1)
    map.remove(nums[i-k]);
else
    map.put(nums[i-k], count - 1);

        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         if(map.size()==k){
            maxsum=Math.max(sum,maxsum);;
        }
           
        }

       return maxsum;
    }
}