class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                int first = mid;
                while(first>=0 && nums[first]==target){
                    first--;
                }
                int last = mid;
                while(last<nums.length && nums[last]==target){
                    last++;
                }
                return new int[]{first+1,last-1};

            }
            else if(target > nums[mid]) left = mid+1;
            else right = mid-1;
        }
        return new int[]{-1,-1};
    }
}