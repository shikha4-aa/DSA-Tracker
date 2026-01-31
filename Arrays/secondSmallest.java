import java.util.ArrayList;

public class secondSmallest {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
         
        int smallest = Integer.MAX_VALUE;  // so that any element in the array will be smaller
        int secondSmallest = Integer.MAX_VALUE;
        
        for(int num:arr){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num > smallest && num < secondSmallest){
                secondSmallest = num;
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        
        if(secondSmallest ==Integer.MAX_VALUE){
            a.add(-1);
        } else{
            a.add(smallest);
            a.add(secondSmallest);
        }
        return a;
    }
}
