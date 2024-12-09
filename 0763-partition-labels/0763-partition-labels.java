class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a'] = i;
        }
        
        int start = 0;
        int end = 0;

        for(int i=0;i<s.length();i++){
            end = Math.max(end,freq[s.charAt(i)-'a']);
            if(i==end){
                res.add(end-start+1);
                start = i +1;

            }
        }
        return res;
        
    }
}