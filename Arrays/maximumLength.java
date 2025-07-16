class Solution {
    public int maximumLength(int[] nums) {
          int evenCount = 0;
        int oddCount = 0;
        int evenOddCount = 0;
        int oddEvenCount = 0;
        
        int lastEvenOdd = -1; // -1: no element, 0: even, 1: odd
        int lastOddEven = -1; // -1: no element, 0: even, 1: odd
        
        for (int num : nums) {
            int parity = num % 2;
            
            // Count all even numbers
            if (parity == 0) {
                evenCount++;
            }
            
            // Count all odd numbers
            if (parity == 1) {
                oddCount++;
            }
            
            // Count alternating pattern starting with even
            if (lastEvenOdd == -1 || lastEvenOdd != parity) {
                evenOddCount++;
                lastEvenOdd = parity;
            }
            
            // Count alternating pattern starting with odd
            if (lastOddEven == -1 || lastOddEven != parity) {
                oddEvenCount++;
                lastOddEven = parity;
            }
        }
        
        return Math.max(Math.max(evenCount, oddCount), Math.max(evenOddCount, oddEvenCount));

    }
}