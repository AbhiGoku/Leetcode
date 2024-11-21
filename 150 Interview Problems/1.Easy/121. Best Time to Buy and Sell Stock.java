class Solution {
  public int maxProfit(int[] prices) {
    int buy = prices[0];
    int maxProfit = 0;

    for (int i : prices) {
      if (buy > i) {
        buy = i;
      } else {
        maxProfit = Math.max(maxProfit, i - buy);
      }
    }
    return maxProfit;

    // int buyPrice=prices[0];
    // int profit=0;
    // int maxProfit=0;

    // for(int i=1;i<prices.length;i++){
    // if(prices[i]<buyPrice){
    // buyPrice=prices[i];
    // }else{
    // profit=prices[i]-buyPrice;
    // maxProfit=Math.max(profit,maxProfit);
    // }
    // }
    // return maxProfit;
  }
}