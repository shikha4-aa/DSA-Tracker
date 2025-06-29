class Solution {
    public static int gcd(int a, int b) {
        
        //Euclid's algo
        if( b == 0){
            return a;
        } else{
            return gcd(b, a%b);
        }
    }
}
//Link: https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1