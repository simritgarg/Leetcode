class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        
        int maxFreqValue = Collections.max(mp.values());
        int countMaxFreq = 0;

        for (int freq : mp.values()) {
            if (freq == maxFreqValue) {
                countMaxFreq++;
            }
        }

        return maxFreqValue * countMaxFreq;
    }
}
