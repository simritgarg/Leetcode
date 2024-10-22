class Solution {
    private List<Integer> temp = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList<>();

    private void recursive(int[] nums, int index) {
        if (index >= nums.length)
            return;
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            result.add(new ArrayList<>(temp));
            recursive(nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<>());
        recursive(nums, 0);
        return result;
    }
}