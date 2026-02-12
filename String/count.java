import java.util.*;
public class count{
        public static void countString(String s){
        int countVowel = 0;
        int countConsonant = 0;
        int countNum = 0;
        int countSpace = 0;
    
        s = s.toLowerCase();
        
        for(char ch: s.toCharArray()){
            if(ch >='a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u'){
                    countVowel++;
                } else countConsonant++;
            }
            
            if(ch >= '0' && ch <= '9'){
                countNum++;
            }
            
            if(ch == ' '){
                countSpace++;
            }
        }
        
        System.out.println(countVowel+ " " +countConsonant + " " + countNum + " " + countSpace);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string: "); 
        String input = sc.nextLine(); 
        countString(input); 

        sc.close();

    }

}