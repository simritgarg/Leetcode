class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] res = new int[n];
        a1[0] = 1;
        a2[n-1] = 1;
        for(int i=1;i<n;i++){
            a1[i] = a1[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            a2[i] = a2[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            res[i] = a1[i]*a2[i];
        }
        return res;
    }
}