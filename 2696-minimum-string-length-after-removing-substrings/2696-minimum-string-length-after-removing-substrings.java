class Solution {
    public int minLength(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(!st.isEmpty() && st.peek()== 'A' && ch[i] == 'B'){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek()== 'C' && ch[i] == 'D'){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        return st.size();


    }
}