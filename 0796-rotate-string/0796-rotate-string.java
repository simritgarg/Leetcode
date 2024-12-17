class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // below code is not passing all test cases :>
        String str = s.concat(s);
        return str.contains(goal);


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