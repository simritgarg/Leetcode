class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, new ArrayList<>(), nums);
        return result;
    }
    private void permutation(List<List<Integer>> result, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                permutation(result,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}