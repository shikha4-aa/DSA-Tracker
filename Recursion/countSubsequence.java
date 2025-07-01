//To count the number of subsets of an array that sum to a given target using backtracking
class Main {
   static int printS(int[] arr, int target, int sum, int index){
            if(index== arr.length){
            if(sum == target){
              
                return 1;
            }
             return 0;
        }
     
     
     sum+= arr[index];
     
     int l= printS(arr, target, sum , index + 1);
         
     
     sum-= arr[index];
     
     int r = printS(arr, target, sum, index + 1);
     
     return l + r;
}

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        int target= 2;
        System.out.print(printS(arr, target, 0, 0));
         }
}
