class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int a=prices.length-1;
        int b=discounts.length-1;
        boolean small=false;
        if(a<b){
            small=true;
        }
        double sum=0;
        while(a>=0&&b>=0){
            sum+=((prices[a--]*(100-discounts[b--]))/100.0);

        }
        if(small){
            return sum;
        }
        while(a>=0){
            sum+=prices[a--];
        }
      
        return sum;
    }
}