
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int[] res = new int[indices.length];
        
        for(int i = 0; i<indices.length; i++){
            int index = indices[i];
            int count = 0;
            for(int j = index+1; j<arr.length; j++){
                if(arr[index] < arr[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
//link: https://practice.geeksforgeeks.org/problems/count-the-number-of-elements-greater-than-every-element-in-an-array/1