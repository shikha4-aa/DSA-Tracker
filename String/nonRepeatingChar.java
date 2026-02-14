import java.util.*;
public class nonRepeatingChar {
    public char nonRepeatingCharSearch(String s) {
        // code here
        
        for(int i = 0; i<s.length(); i++){
            boolean unique = true;
            
            for(int j = 0; j<s.length(); j++){
                
                if(i!= j && s.charAt(i) == s.charAt(j)){
                    unique = false;
                    break;
                }
            }
            
            if(unique){
                return s.charAt(i);
            }
            
        }
        
        return '$';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        nonRepeatingChar obj = new nonRepeatingChar();
        System.out.println(obj.nonRepeatingCharSearch(s));
        sc.close();
    }
}
