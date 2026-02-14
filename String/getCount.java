import java.util.HashMap;
import java.util.Scanner;

public class getCount {

    int getCountCharacters(String S, int N) {
        HashMap<Character, Integer> mp = new HashMap<>();
        
        int i = 0;

        while (i < S.length()) {
            char curr = S.charAt(i);
            int j = i;

            while (j < S.length() && S.charAt(j) == curr) {
                j++;
            }

            // One group found
            mp.put(curr, mp.getOrDefault(curr, 0) + 1);

            i = j;  
        }
        
        int count = 0;
        for(int p: mp.values()){
            if(p == N) count++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String S = sc.nextLine();
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();

        getCount gc = new getCount();
        int result = gc.getCountCharacters(S, N);
        System.out.println("The count of characters that appear in groups of " + N + " is: " + result);

        sc.close();
    }
}
