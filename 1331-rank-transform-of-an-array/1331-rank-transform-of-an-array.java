import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
       
        int[] arr2 = Arrays.copyOf(arr, n);
        Arrays.sort(arr2);
      
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

    
        for (int num : arr2) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;

    }
}

Method-2
    
import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0]; // Handle edge case for empty array
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
