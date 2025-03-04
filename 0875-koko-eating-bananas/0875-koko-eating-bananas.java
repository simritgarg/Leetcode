class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i: piles){
            max = Math.max(max, i);
        }
        return BS(piles,h,max);
    }
    public int calculate_Hrs(int[] piles, int k){
        int hrs = 0;
        for (int i : piles){
            // hrs += Math.ceil((double)piles[i]/k);
            hrs += (i + k - 1) / k;
        }
        return hrs;
    }
    public int BS(int[] piles, int h, int max){
        int low = 1;
        int high = max;
        while(low < high){
            int mid = low + (high-low)/2;
            int t = calculate_Hrs(piles,mid);
            if(t <= h) high = mid;
            else low = mid+1;
        }
        return low;
    }
}