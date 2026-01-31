public class maxAbsDiff {
    public int findMaxDiff(int[] arr) {
        // code here
        int maxDiff= 0;
        for(int i = 0; i < arr.length; i++){
            
            //left
            int left = 0;
            for(int j = i-1; j>=0; j--){
                if(arr[i] > arr[j]){
                    left = arr[j];
                    break;
                }
            }
            
            //right
            int right = 0;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    right = arr[j];
                    break;
                }
            }
            
            
            int ans = Math.abs(left - right);
            maxDiff= Math.max(maxDiff, ans);
        }
        return maxDiff;
    }
}
