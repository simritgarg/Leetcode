class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        for(int i=0;i<trust.length;i++){
            int p1 = trust[i][0];
            int p2 = trust[i][1];
            out[p1]++;
            in[p2]++;
        }
        for(int i=1;i<=n;i++){
            if(in[i]==n-1 && out[i]==0){
                return i;
            }
        }
        return -1;
        
    }
}