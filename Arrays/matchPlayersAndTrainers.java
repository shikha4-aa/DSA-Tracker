//Link: https://leetcode.com/problems/match-players-with-trainers/
//Problem: Match players with trainers such that the player's skill is less than or equal to the trainer's skill.

import java.util.Arrays;
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j= 0;

        while(i < players.length && j<trainers.length){
            if(players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else{
                j++;
            }

        }
        return count;
    }
}