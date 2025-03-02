class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i: nums){
        //     mp.put(i,mp.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> e: mp.entrySet()){
        //     if(e.getValue()==1) return e.getKey();
        // }
        // return 0;

        // for log(n) - Binary Search
        // int left =0;
        // int right = nums.length-1;
        // while(left<right){
        //     int mid = left + (right-left)/2;
        //     if(mid%2==1) mid--;
        //     if(nums[mid]!= nums[mid+1]) right =mid;
        //     else left = mid +2;
        // }
        // return nums[left];

        // M-2 Binary Search
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int left =1;
        int right = n-2;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((nums[mid] != nums[mid-1]) && (nums[mid] != nums[mid+1])) return nums[mid];
            if((mid%2==1 && nums[mid] == nums[mid-1])  || (mid%2==0 && nums[mid] == nums[mid+1])) left = mid+1;
            else right = mid-1;
        }
        return -1;

    }
}