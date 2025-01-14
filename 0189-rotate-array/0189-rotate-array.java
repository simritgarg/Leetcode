class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int[] res = new int[nums.length];
        int i=0;
        for(int j=n-k;j<n;j++){
            res[i] = nums[j];
            i++;
        }
        for(int j=0;j<n-k;j++){
            res[i] = nums[j];
            i++;
        }
        
        for(int j = 0; j < res.length; j++) {
            nums[j] = res[j];
        }
    }
}