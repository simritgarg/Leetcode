class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k = 0;
        while(k<=j){
            if(nums[k] == 2){
                int t = nums[k];
                nums[k] = nums[j];
                nums[j] = t;
                j--; 
            }
            else if(nums[k]==0){
                 int t = nums[k];
                nums[k] =  nums[i];
                nums[i] = t;
                i++;
                k++;
            }
            else k++;
        }
    }
}