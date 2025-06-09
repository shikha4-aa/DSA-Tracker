//Problem: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
class Solution {
    public int numberOfSubstrings(String s) {
   
        int count[] = new int[3];

    //   for(char ch: s.toCharArray()){
    //     if(ch=='a'){
    //         count[0]++;
    //     } else if(ch=='b'){
    //         count[1]++;
    //     } else{
    //         count[2]++;
    //     }
    // }

int start = 0;
int res =0;
for(int end=0; end<s.length(); end++){
    count[s.charAt(end)-'a']++;

    while(count[0]>0 && count[1]>0 && count[2]>0){
        res+= s.length()- end;
        count[s.charAt(start)-'a']--;
        start++;
    }
}
return res;

    }
}