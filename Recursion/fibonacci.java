//Link: https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
      if(n==0){
        return 0;
      }
      if(n==1){
        return 1;
      } 
      return fib(n-1) + fib(n-2);
    }

    //better solution
    /*int a = 0;
    int b= 1;
    int sum =0;

    if(n==1){
        return 1;
    }

    for(int i=1; i<n; i++){
       sum = a+b;
       a = b;
       b= sum;
    }
    return sum; */
}