class Solution {
    public String addBinary(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        while (y != 0) {
            int sum = x ^ y;
            int carry = (x & y) << 1;
            x = sum; 
            y = carry;
        }
        return Integer.toBinaryString(x);
    }
}