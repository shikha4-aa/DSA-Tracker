import java.util.Scanner;
class areAnagrams {
    public static boolean areAnagramsCheck(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] b = new int[26];
        
        for(int i = 0; i<s1.length(); i++){
            b[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']--;
        }
        
        for(int count: b){
            if(count!=0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        boolean result = areAnagramsCheck(s1, s2);
        if(result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}