class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int altmax=0;
        for(int i=0;i<gain.length;i++){
           alt+=gain[i];
           altmax=Math.max(alt,altmax);
        }
        return altmax;
    }
}