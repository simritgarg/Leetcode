class Solution {
    public String makeGood(String s) {
        int x = 0;
        char[] ch = new char[s.length()];
        for(char c: s.toCharArray()){
            if(x>0 && Math.abs(ch[x-1] - c) ==32){
                x--;
            }
            else{
                ch[x++] = c;
            }
        }
        return new String(ch,0,x);
    }
}