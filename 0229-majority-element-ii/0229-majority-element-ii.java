class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i: nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        int val = nums.length/3;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()>val) a.add(e.getKey());
        }
        return a;
    }
}