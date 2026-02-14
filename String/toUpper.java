import java.util.*;

public class toUpper {
    public static String to_upper(String str) {
        StringBuilder ans = new StringBuilder();
        
        for(char c: str.toCharArray()){
            
            if(c >= 'a' && c<= 'z') {
                 c= (char)(c - 32);
        }
        ans.append(c);
    }
        
        return ans.toString();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println(to_upper(str));
        sc.close();
    }
}
