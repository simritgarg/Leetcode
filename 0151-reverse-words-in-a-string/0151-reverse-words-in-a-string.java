class Solution {
    public String reverseWords(String s) {
        //Method-1 (String)
        // StringBuilder str = new StringBuilder();
        // String[] arr = s.split("\\s+");
        // for(int i = arr.length-1; i>=0; i--){
        //     str.append(arr[i]);
        //     str.append(" ");

        // }
        // return str.toString().trim();

        // Method-2 (2 pointer)
        String[] str = s.split(" ");
        int left = 0;
        int right = str.length-1;
        while(left < right){
            String t = str[left];
            str[left] = str[right];
            str[right] = t;
            left++;
            right--;
        }
        StringBuilder res = new StringBuilder();
        for(String st : str){
            if(!st.isEmpty()){
                if(res.length()>0){
                    res.append(" ");
                }
                res.append(st);
            }
        }
        return res.toString().trim();

        
    }
}