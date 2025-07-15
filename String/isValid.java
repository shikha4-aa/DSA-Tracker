class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
         boolean isVowel = false;
         boolean isConsonant = false;

        for(char ch: word.toCharArray()){
            if (!Character.isLetterOrDigit(ch)) return false;

            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                isVowel= true;
     } else {
        isConsonant = true;
        }
    }
}

   return isVowel && isConsonant;
    }
}

// Link: https://leetcode.com/problems/valid-word-abbreviation/
// Problem: Check if a word contains at least one vowel and one consonant 
