class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
int n=nums.length;
int maxprod=nums[n-1]*nums[n-2]*nums[n-3];
if(nums[0]<0){
    maxprod=Math.max(maxprod,nums[0]*nums[1]*nums[n-1]);
}
return maxprod;
    }
}