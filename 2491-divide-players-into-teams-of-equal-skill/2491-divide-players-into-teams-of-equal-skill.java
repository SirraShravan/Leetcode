class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        int i=0,j=n-1;
        long prod=0;
        int sum=skill[0]+skill[n-1];
        while(i<j){
            if(sum!=skill[i]+skill[j]){
                return -1;
            }else{
                prod+=(skill[i]*skill[j]);
            }
            i++;
            j--;
        }
        return prod;
    }
}