import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class smallestUnitString {
    public static String removeDuplicates(String s) {
        Set<Character> set = new TreeSet<>();
        
        for(char ch: s.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: set){
            sb.append(ch);
        }
        
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print(removeDuplicates(s));

        sc.close();
    }
}
