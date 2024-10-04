class Solution {
    public String stringHash(String s, int k) {
        
        StringBuilder  res = new StringBuilder();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        // for(int i=0; i<alphabets.length();i++){
        //     hashtable.put(i, alphabets[i]);
        // }
        for(int i=0;i<s.length();i+=k){
            int sum =0;
            for(int j=0;j<k && (i+j)<s.length();j++){
                char currentChar = s.charAt(i+j);
                int position = currentChar - 'a';
                sum += position;
            }
            int index = sum % 26;
            char resultChar = alphabets.charAt(index);
            res.append(resultChar);
        }
        return res.toString();
    }
}