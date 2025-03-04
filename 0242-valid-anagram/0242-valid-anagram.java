class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        // Method - 1 (Sorting)
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);

        //Method - 2 (freq Array)
        // int[] freq = new int[26];
        // for(int i=0;i<s.length();i++){
        //     freq[s.charAt(i) - 'a']++;
        //     freq[t.charAt(i) - 'a']--;
        // }
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]!=0) return false;
        // }
        // return true;


        // Method - 3 Same as Method-2 
        // but still little optimized as it reduces the cache misses
        int[] f = new int[26];
        for(int i: s.toCharArray()){
            f[i - 'a']++;
        }
        for(int i: t.toCharArray()){
            f[i - 'a']--;
        }
        for(int i : f){
            if(i!=0) return false;
        }
        return true;

    }
}