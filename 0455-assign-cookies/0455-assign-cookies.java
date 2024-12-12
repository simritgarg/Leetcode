class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int x = 0;
        int y = 0;
        int count = 0;
        while(s.length>y && g.length>x){
            if(s[y] >= g[x]){
                count++;
                x++;
            }
            y++;
            
        }
        return count;
    }
}