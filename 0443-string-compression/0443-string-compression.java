class Solution {
    public int compress(char[] chars) {
        int j = 0;  // Pointer to write compressed result
        int count = 1;  // Initialize count for the first character

        for (int i = 0; i < chars.length; i++) {
            // Check if the current character is the same as the next
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                // Store the current character
                chars[j++] = chars[i];

                // If count is greater than 1, add the count to the array
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[j++] = c;  // Add each digit of the count
                    }
                }

                // Reset the count for the next character
                count = 1;
            }
        }

        return j;

    }
}