class Solution {
    public void moveZeroes(int[] nums){
        //method-1 not in place
    //     int[] res = new int[nums.length];
    //     int j=0;
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] != 0){
    //             res[j] = nums[i];
    //             j++;
    //         }
    //         else{
    //             count++;
    //         }
    //     }
    //     for(int i=0;i<count;i++){
    //         res[j] = 0;
    //         j++;
    //     }
    //    for(int i=0;i<res.length;i++){
    //        nums[i] = res[i];
    //    }  

    // method-2
        int left = 0; 
        int right = 0; 
        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        
    }
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
    // to shift the zeroes to the front
        // int left = 0;
        // int right = 1;
        // while(right < nums.length){
        //     if(nums[left]==0){
        //         left++;
        //     }
        //     if(nums[left]!=0 && nums[right]==0){
        //         swap(nums,left,right);
        //         left++;
        //     }
        //     right++;