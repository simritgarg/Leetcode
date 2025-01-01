class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentEle = nums[i];
            if(mp.containsKey(target- currentEle)){
                return new int[] {i,mp.get(target-currentEle)};
            }
            mp.put(currentEle,i);
        }
        return new int[]{};
    }
}