class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];  // Supports all ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;  // Count frequency
        }

        // Step 2: Store characters in a list and sort them by frequency
        Character[] chars = new Character[256];
        for (int i = 0; i < 256; i++) {
            chars[i] = (char) i; // Store each character
        }

        Arrays.sort(chars, (a, b) -> freq[b] - freq[a]); // Sort by frequency in descending order

        // Step 3: Build the sorted string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (freq[c] > 0) {  // Append only if frequency > 0
                result.append(String.valueOf(c).repeat(freq[c]));
            }
        }

        return result.toString();
    }
}