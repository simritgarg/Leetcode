class Solution {
    public int[] rearrangeArray(int[] nums){
        int idx=1;
        while(idx<=nums.length-2){
            if((nums[idx-1]+nums[idx+1])/2!=nums[idx]){
                idx++;
            }
            else{
                int t = nums[idx];
                nums[idx] = nums[idx+1];
                nums[idx+1] = t;
                if(idx>1){
                    idx--;
                }
            }
        }
        return nums;
    }
}