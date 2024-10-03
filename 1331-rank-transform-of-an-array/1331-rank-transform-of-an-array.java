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