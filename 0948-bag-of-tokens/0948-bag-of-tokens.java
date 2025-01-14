class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int left = 0;
        int right = tokens.length-1;
        Arrays.sort(tokens);
        int max = 0;
        while(left<=right){
            if(tokens[left]<=power){
                power -= tokens[left];
                score++;
                left++;
                max = Math.max(max,score);
            }
            else if(score>=1){
                power += tokens[right];
                score--;
                right--;
            }
            else{

                break;
            }

        }
        return max;



    }
}