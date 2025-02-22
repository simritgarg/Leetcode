class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i: piles){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        for(int i = 1;i<=max;i++){
            int timeTaken = calculate_Hrs(piles,i);
            if(timeTaken <= h) return i;
        }
        return max;
    }
    public int calculate_Hrs(int[] piles, int k){
        int hrs = 0;
        for(int i=0;i<piles.length;i++){
            hrs += Math.ceil((double)piles[i]/k);
        }
        return hrs;
    }
    // public int BS(int min, int max){
    //     int low = 0;
    //     int high = max-min+1;
    //     while(low < high){
    //         int mid = low + (high-low)/2;

    //     }
    // }
}
// 3,6,7,11 - > min =3 and max =11
// 3..11 k=min h--; if(time>h) k++ - > k=4
// 1,2,3,4->10h X