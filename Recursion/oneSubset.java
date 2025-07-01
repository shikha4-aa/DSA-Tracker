// Program to print one subset of an array that sums to a given target using backtracking
//Link: https://www.geeksforgeeks.org/subset-sum-problem-using-backtracking/
import java.util.ArrayList;
class Main {
   static boolean printS(int[] arr, int target, int sum, ArrayList<Integer> current, int index){
            if(index== arr.length){
            if(sum == target){
                System.out.println(current);
                return true; //if condition is met, return true and this will print only one subset
            }
             return false;
        }
     
     
     current.add(arr[index]);
     
     if(printS(arr, target, sum + arr[index], current, index + 1)== true){
         return true;
     }
     
     current.remove(current.size() - 1); //backtrack
     
     if(printS(arr, target, sum, current, index + 1)== true){
         return true;
     }
     return false;
}

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        int target= 2;
        ArrayList<Integer> current = new ArrayList<>();
        printS(arr, target, 0, current, 0);
         }
}
