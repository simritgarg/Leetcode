class Solution {
    public String removeOuterParentheses(String s) {

        // Using Stack
        // Stack<Character> st = new Stack<>();
        // StringBuilder str = new StringBuilder("");
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         if(st.size()>0){
        //             str.append(s.charAt(i));
        //         }
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         st.pop();
        //         if(st.size()>0){
        //             str.append(s.charAt(i));
        //         }
        //     }
        // }
        // return str.toString();

        // Using String
        // String res = "";
        // int count = 0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) =='(' && count==0){
        //         count++;
        //     }
        //     else if(s.charAt(i) =='(' && count>=1){
        //         res += s.charAt(i);
        //         count++;
        //     }
        //     else if( s.charAt(i) ==')' && count>1){
        //         res += s.charAt(i);
        //         count--;
        //     }
        //     else if(s.charAt(i) ==')' && count==1){
        //         count--;
        //     }
        // }
        // return res;

        // using String solution - 2
        int count = 0;
        StringBuilder res = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '('){
                if(count != 0) res.append(c);
                count++;
            }
            else{
                if(count!=1) res.append(c);
                count--;
            }
        }
        return res.toString();

        
    }
}