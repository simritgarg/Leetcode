class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int sign = 1;
        int idx = 0;
        if(s.charAt(0)=='-'){
            sign = -1;
            idx++;
        }
        else if (s.charAt(0) == '+') {
            idx++;
        }
        long result = 0;
         while (idx < s.length() && Character.isDigit(s.charAt(idx))){
                result = result*10 + (s.charAt(idx)-'0');
                if (result > Integer.MAX_VALUE) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            
                idx++;
        }  
        return (int) (result*sign); 
    }
}