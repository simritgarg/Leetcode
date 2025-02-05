class Solution {
    public int compress(char[] chars) {
        int j = 0, count = 1;  
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[j++] = chars[i];
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[j++] = c; 
                    }
                }
                count = 1;
            }
        }

        return j;

    }
}