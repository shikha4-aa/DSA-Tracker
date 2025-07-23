class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x> y){
            return removeSubstring(s, x, y, 'a', 'b');
        } else{
            return removeSubstring(s, y, x, 'b', 'a');
        }
    }


    private int removeSubstring(String s, int firstPoint, int secondPoint, char first, char second){
        Stack<Character> stack = new Stack<>();
        int total = 0;

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == first && c== second){
                stack.pop();
                total+= firstPoint;
            } else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
        sb.append(stack.pop());
    }
    sb.reverse();


        //second substring
        Stack<Character> temp = new Stack<>();

        for(char c: sb.toString().toCharArray()){
            if(!temp.isEmpty() && c== first && temp.peek()== second){
                temp.pop();
                total+= secondPoint;
            } else{
                temp.push(c);
            }
        }
        return total;
    }
}

// Link: https://leetcode.com/problems/maximum-gain-from-two-substrings/
// Problem: You are given a string s and two integers x and y. You can remove two non-overlapping substrings from s, one of which is "ab" and the other is "ba". The score of removing "ab" is x and the score of removing "ba" is y. Return the maximum score you can achieve by removing these two substrings.