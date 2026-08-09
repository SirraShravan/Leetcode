class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        String s=moves;
        int lc=0,rc=0,ds=0;
        for(int i=0;i<moves.length();i++){
            if(s.charAt(i)=='L'){
                lc++;
            }else if(s.charAt(i)=='R'){
                rc++;
            }else{
                ds++;
            }
        }
        return (Math.max(lc,rc)-Math.min(lc,rc)+ds);
    }
}