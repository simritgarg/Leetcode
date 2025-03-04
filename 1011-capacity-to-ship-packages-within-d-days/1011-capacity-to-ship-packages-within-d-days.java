class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        // int min = Integer.MAX_VALUE;
        for(int i: weights){
            right += i;
            left = Math.max(i,left);
        }
        return BS(weights, days, left, right);
    }
    public int calc_days(int[] weights, int days, int k){
        int wt = 0;
        int d = 1;
        for(int i: weights){
            wt += i;
            if(wt>k){
                d++;
                wt = i;
            }
        }
        return d;
    }
    public int BS(int[] weights, int days, int left, int right){
        while(left<right){
            int mid = left + (right-left)/2;
            int d = calc_days(weights, days, mid);
            if(d<=days) right = mid;
            else left = mid +1;
        }
        return left;
    }
}