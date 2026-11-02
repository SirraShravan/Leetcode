class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long sum=0;
        int left=0;
        int n=nums.size();
        int num=nums.get(left);
        for(int i=1;i<n;i++){
            if(nums.get(i)<num){
                continue;
            }
            sum+=((long)i-left)*num;
            left=i;
            num=nums.get(left);
        }
       
        return sum+=(long)(n-1-left)*num;
    }
}