class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int n=nums.length;
        if(n<3){
            return -1;
        }
       for(int i=0;i<n;i++){
        
        map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
       }
       int ans=Integer.MAX_VALUE;
       for(List<Integer> list:map.values()){
        if(list.size()<3){
            continue;
        }
        for(int i=0;i<list.size()-2;i++){
            int first=list.get(i);
            int third=list.get(i+2);
            ans=Math.min(ans,2*(third-first));
        }
       }
       return ans==Integer.MAX_VALUE?-1:ans;
    }
}