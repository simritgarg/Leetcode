class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.split("\\s+");
        for(int i = arr.length-1; i>=0; i--){
            str.append(arr[i]);
            str.append(" ");

        }
        return str.toString().trim();
        
    }
}