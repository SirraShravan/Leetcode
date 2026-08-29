class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String>str=new ArrayList<>();
        int left=0;
       for(int i=0;i<n;i++){
           int start=i;
            while(i+1<n&&nums[i]+1==nums[i+1]){
                i++;
            }
            if(i==start){
                str.add(String.valueOf(nums[start]));
            }else{
                str.add(nums[start]+"->"+nums[i]);
            }
        }
        return str;
    }
}