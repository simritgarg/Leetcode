class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int sum = 0;
        for (int i : nums) {
            sum = Math.max(sum, i);
        }

        return BS(nums, sum, 1, threshold);
    }
    public int BS(int[] nums, int right, int left, int threshold){
        while(left<right){
            int sum = 0;
            int mid = left + (right-left)/2;
            for(int i: nums){
                sum += (i + mid - 1) / mid;
            }
            if(sum > threshold) left = mid+1;
            else right = mid;
            // if sum is > thres. so we need the num. > to make the sum < as it is dividing it
        }
        return left;
    }
}