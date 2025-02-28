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
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid%2==1) mid--;
            if(nums[mid]!= nums[mid+1]) right =mid;
            else left = mid +2;
        }
        return nums[left];
        


    }
}