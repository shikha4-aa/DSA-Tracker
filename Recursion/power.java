class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1;
        } 

        if(n<0){
            return 1/myPow(x, -n); //this has a problem when n == Integer.MIN_VALUE (-2147483648) — you can’t negate it, because -(-2147483648) overflows. thinking of a better solution.
        }

        return x* myPow(x, n-1);
    }
}