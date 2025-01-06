class Solution {
    public String intToRoman(int num) {
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(num==0) break;
            while(num>=arr[i]){
                str.append(roman[i]);
                num -= arr[i];
            }
        }
        return str.toString();
    }
}