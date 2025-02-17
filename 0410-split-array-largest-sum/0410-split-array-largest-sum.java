class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        // to get the min and max of the array
        for(int i: nums){
            low = Math.max(i,low);
            high += i;
        }
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canPaint(nums,mid,k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return ans;
    }
    public boolean canPaint(int[] arr, int time, int k){
        int count = 1;
        int sum = 0;
         for(int x : arr){
            sum += x;
            if(sum > time){
                count++;
                sum = x;
            }
        }
        return count <= k;
    }
}