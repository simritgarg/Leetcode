import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(arr2[0],1);
        for(int i=1;i<arr.length;i++){
            if(arr2[i]>arr2[i-1]){
                mp.put(arr2[i],mp.get(arr2[i-1])+1);
            }
            else{
                mp.put(arr2[i],mp.get(arr2[i-1]));
            }
            
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = mp.get(arr[i]);
        }
        return res;

    }
}