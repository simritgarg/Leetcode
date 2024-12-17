class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // Method - 1
        // String str = s.concat(s);
        // return str.contains(goal);

        //method - 2 (substring concept)
        String str = s;
        for (int i = 0; i < s.length(); i++) {
            str = str.substring(1) + str.charAt(0);
            if (str.equals(goal)) return true;
        }
        return false;


        // StringBuilder res = new StringBuilder();
        // StringBuilder str = new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=goal.charAt(i)){
        //         str.append(s.charAt(i));
        //     }
        //     else{
        //         res.append(s.charAt(i));
        //     }
            
        // }
        // res = res.append(str);
        // return 


        
        
    }
}