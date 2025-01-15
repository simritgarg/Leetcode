class Solution {
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end && s.charAt(start)==s.charAt(end)){
            int currEle = s.charAt(start);
            while(start<=end && s.charAt(start)==currEle){
                start++;
            }
            while(start<=end && s.charAt(end) == currEle){
                end--;
            }
            
        }
        return end-start+1;
    }
}