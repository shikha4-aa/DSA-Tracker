//Problem: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
class Solution {
    int countFreq(int[] arr, int target) {
        
        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        
        if(first==-1){
            return 0;
        }
        
        return last - first + 1;
    }
        
        //Optimal approach
        
        private int firstOccurence(int arr[], int target){
       
        int start = 0;
        int end = arr.length - 1;
        int ans= -1;
        
        
        while(start<=end){
            int mid = (start+ end)/2;
            //was having issue with certain test cases bc you need the correct else if ladder to handle <, >, and == separately. If your else is too vague — it might incorrectly end the loop early.
           if (arr[mid] < target) {
             start = mid + 1;
}            else if (arr[mid] > target) {
                end = mid - 1;
} else {
   ans = mid;
   end = mid-1;
}
        }
        return ans;
    }
    
    private int lastOccurence(int arr[], int target){
        
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while(start<=end){
            int mid = (start+ end)/2;
            if (arr[mid] < target) {
            start = mid + 1;
}     else if (arr[mid] > target) {
   end = mid - 1;
} else {
   ans = mid;
   start = mid + 1;
}
        }
        return ans;
    }
    
}