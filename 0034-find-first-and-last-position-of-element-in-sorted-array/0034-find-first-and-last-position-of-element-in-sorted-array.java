class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int right = nums.length-1;
        // int idx = 0;
        int[] result = {-1,-1};
        while(low<=right){
            int mid = low + (right-low)/2;
            if(target==nums[mid]){
                int first = mid;
                while(first>0 && nums[first-1]==target){
                    first--;
                }
                int last = mid;
                while(last < nums.length - 1 && nums[last+1]==target){
                    last++;
                }
                result[0] = first;
                result[1] = last;
                break;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else low = mid+1;
        }
        return result;
        
    }
}