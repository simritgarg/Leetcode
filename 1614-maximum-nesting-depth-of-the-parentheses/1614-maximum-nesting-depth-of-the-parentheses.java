class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack();
        int max = 0, count = 0;
        for( char c : s.toCharArray()){
            if(c =='('){
                st.push(c);
                count = st.size();
            }
            else if( c == ')'){
                st.pop();
                if(max<count){
                    max = count;
                }
                
            }
        }
        return max;
    }
}