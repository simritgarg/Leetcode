class Solution {
    public int findPeakElement(int[] nums) {
        // some test cases not passed
        // if(nums.length==2  && nums[0]<nums[1]) return 1;
        // if(nums.length==2 && nums[0]>nums[1]) return 0;
        // for(int i=1;i<nums.length-1;i++){
            
        //     if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
            
        // }
        // return 0;
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;

    }
}