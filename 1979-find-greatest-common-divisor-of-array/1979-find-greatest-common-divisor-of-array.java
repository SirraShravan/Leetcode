class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        int a=min;
        while(a>=1){
            if(max%a==0&&min%a==0){
                return a;
            }
            a--;
        }
        return 1;
    }
}