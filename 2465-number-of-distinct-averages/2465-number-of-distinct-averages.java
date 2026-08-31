class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashMap<Double,Integer>map=new HashMap<>();
        int n=nums.length;
        int left=0,right=n-1;
        int count=0;
        while(left<right){
            Double avg=(nums[left]+nums[right])/2.0;
            if(map.getOrDefault(avg,0)==0){
                count++;
                map.put(avg,1);
            }
            left++;
            right--;
        }
        return count;
    }
}