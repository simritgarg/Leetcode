class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue() == 1){
                l.add(e.getKey());
            }
        }
        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        
        return result;
    }
}