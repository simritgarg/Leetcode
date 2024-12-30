class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        int index = 0;
        for (int num : s) {
            nums[index++] = num;
        }
        
        return s.size();
    }
}