class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0];
        int b=nums[n-1];
        for(int i=a;i<=b;i++){
            list.add(i);
            
        }
        for(int num:nums){
           list.remove(Integer.valueOf(num));
        }
        return list;
    }
}