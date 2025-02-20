class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // we have to play with the indexes
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = 0;
                
            }
            else{
                ans[i] = s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}