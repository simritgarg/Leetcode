class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.size()>1 && c==')' && s.charAt(st.peek()) == '('){
                st.pop();
                max = Math.max(max,i-st.peek());
            }
            else{
                st.push(i);
            }
            
        }
        return max;
    }
}