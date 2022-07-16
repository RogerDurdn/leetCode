class Solution {
    
    public int maxProfit(int[] prices) {
        int profit = 0;
        int smallPossible = prices[0];
        for(int i=0; i< prices.length; i++){
            if(prices[i] < smallPossible){
                smallPossible = prices[i];
            }else{
                int currentProfit = prices[i] - smallPossible;
                if(currentProfit > profit){
                    profit = currentProfit;
                }
            }
        }
        return profit;
    }
}