class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int left = 0;
        int right = tokens.length-1;
        int maxScoreGot = 0;
        Arrays.sort(tokens);
        while(left<=right){
            if(power>=tokens[left]){
                score++;
                power-=tokens[left++];
                maxScoreGot = Math.max(maxScoreGot,score);
            }
            else if(score>0){
                score--;
                power+=tokens[right--];
            }
            else{
                break;
            }
        }
        return maxScoreGot;

    }
}