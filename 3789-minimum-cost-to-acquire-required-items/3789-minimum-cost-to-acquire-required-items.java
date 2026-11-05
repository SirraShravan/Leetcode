class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost=Math.min(costBoth,cost1+cost2);
        long need=Math.min(need1,need2);
        long rem=Math.abs(need1-need2);
        long costrem=need1>=need2?cost1:cost2;
        long ans1= cost*need+(costrem*rem);
        long ans2=(long)cost*Math.max(need1,need2);
        return Math.min(ans1,ans2);


    }
}