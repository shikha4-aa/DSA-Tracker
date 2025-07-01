//Program to print all subsets of an array that sum to a given target using backtracking
//Problem: https://www.geeksforgeeks.org/subset-sum-problem-using-backtracking/
import java.util.ArrayList;
class Main {
   static void printS(int[] arr, int target, int sum, ArrayList<Integer> current, int index){
            if(index== arr.length){
            if(sum == target){
                System.out.println(current);
            }
             return;
        }
     
     
     current.add(arr[index]);
     printS(arr, target, sum + arr[index], current, index + 1);
     
     current.remove(current.size() - 1); //backtrack
     
     printS(arr, target, sum, current, index + 1); //check other possibilities
     
}

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        int target= 2;
        ArrayList<Integer> current = new ArrayList<>();
        printS(arr, target, 0, current, 0);
         }
}
