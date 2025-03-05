class Solution {
    public String largestOddNumber(String num) {
        // Working only for small strings but given constraint is 1 <= num.length <= 105 
        // int n = Integer.parseInt(num);
        // while(n>0){
        //     if(n%2 !=0 ){
        //         return String.valueOf(n);
        //     }
        //     n = n/10;
        // }
        // return "";

        for(int i = num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0') % 2 !=0) return num.substring(0,i+1);
        }
        return "";
    }
}