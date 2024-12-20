import java.util.Hashtable;
class Solution {
    public int romanToInt(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10 );
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);
        
        int sum =0;

        for (int i=0 ;i< s.length();i++){
            char c = s.charAt(i) ;
            if (i+1 < s.length() && hashtable.get(c) < hashtable.get(s.charAt(i+1)))
            {
                sum -= hashtable.get(c);
                }

           else{
            sum += hashtable.get(c);
            }
            }
            return sum ;
           


        
    }
}