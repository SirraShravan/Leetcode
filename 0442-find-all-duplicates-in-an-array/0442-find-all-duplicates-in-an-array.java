class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
       int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                list.add(nums[i]);
            }
        }
        return list;
    }
}