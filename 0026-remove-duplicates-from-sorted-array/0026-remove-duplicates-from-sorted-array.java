class Solution {
    public int removeDuplicates(int[] nums) {
        //In-Place change code - in array itself without using any other data structure
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

        
    }
}