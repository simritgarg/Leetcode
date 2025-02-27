// THis is the code where we are forming the map but how we will sort it

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer,Integer> tmp = new TreeMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(tmp.containsKey(nums[i])){
//                 tmp.put(nums[i],tmp.get(nums[i])+1);
//             }
//             else{
//                 tmp.put(nums[i],1);
//             }
//         }
//         System.out.println(tmp);
//         return new int[0];
//     }
// }

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Use a min-heap to keep the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // Step 3: Extract the top k elements from the heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        
        return result;
    }
}