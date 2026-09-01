class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>pref=new ArrayList<>();
        int n=nums.length;
        int count=0;
       for(int bit:nums){
         count=(count*2+bit)%5;
        pref.add(count==0);
       }
        return pref;
    }
}