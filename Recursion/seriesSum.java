//Problem: Series Sum
//Link: https://practice.geeksforgeeks.org/problems/series-sum-1/1
class Solution {
    public static int seriesSum(int n) {
        // code here
        if(n<=0){
            return 0;
        }
        return n + seriesSum(n-1);
    }
}
