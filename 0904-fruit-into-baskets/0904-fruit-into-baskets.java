class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        int left = 0;
        int right =0;
        while(right<fruits.length){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            while(mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);
                if(mp.get(fruits[left]) == 0) {
                    mp.remove(fruits[left]);
                }
                left++;
            }
            count = Math.max(count,right-left+1);
            right++;

        }
        return count;
    }
}