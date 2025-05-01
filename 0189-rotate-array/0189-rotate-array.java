class Solution {
    public void rotate(int[] nums, int k) {
        // method -1
        // k = k % nums.length;
        // int n = nums.length;
        // int[] res = new int[nums.length];
        // int i=0;
        // for(int j=n-k;j<n;j++){
        //     res[i] = nums[j];
        //     i++;
        // }
        // for(int j=0;j<n-k;j++){
        //     res[i] = nums[j];
        //     i++;
        // }
        
        // for(int j = 0; j < res.length; j++) {
        //     nums[j] = res[j];
        // }

        // method-2
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}