class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of each element
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int maxFreq = Collections.max(map.values());
        int countOfMaxFreq = 0;

        // Count how many elements have the maximum frequency
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                countOfMaxFreq++;
            }
        }

        return maxFreq * countOfMaxFreq;
    }
}
