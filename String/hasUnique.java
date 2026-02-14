import java.util.*;

class hasUnique {

    public static boolean hasUniqueChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            if(mp.containsKey(ch)) return false;
            mp.put(ch, 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print(hasUniqueChar(s));

        sc.close();
    }
}
