//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Problem: Find the maximum profit from buying and selling a stock given an array of prices.

class Solution {
    public int maxProfit(int[] prices) {
       
       int min = Integer.MAX_VALUE;
       int maxp = 0;

       for(int price: prices){
        if(price < min){
            min = price;
        } else{
            maxp= Math.max(maxp, price - min);
        }
            
       }
   return maxp;

    }
}