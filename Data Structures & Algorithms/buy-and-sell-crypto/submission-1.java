class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length<2){
            return 0;
        }

        int l=0;
        int r=1;
        int buy=prices[l];
        int sell=prices[r];

        int res=0;

        while(l<prices.length && r<prices.length){

              if(prices[l]>prices[r]){
                prices[l]=prices[r];
                r++;
              }
              else{
                res=Math.max(res,prices[r]-prices[l]);
                r++;
              }
        }
        return res;
        
    }
}
