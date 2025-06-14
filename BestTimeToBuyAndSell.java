class Solution {
    public int maxProfit(int[] prices) {
        int lil = prices[0];
        int prof=0;
       for(int i=1;i<prices.length;i++){
        if(prices[i]<lil){
            lil=prices[i];
        }else{
            prof = Math.max(prof,prices[i]-lil);
        }
       }
       return prof;
    }
}
