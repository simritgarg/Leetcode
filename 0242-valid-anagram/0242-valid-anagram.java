class Solution {
    public boolean isAnagram(String s, String t) {
        // Method - 1 (Sorting)
        if(s.length()!=t.length()) return false;
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);

        //Method - 2 (freq Array)
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;

    }
}