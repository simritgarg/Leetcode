class Solution {
    public String frequencySort(String s) {
         Map<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int size = mp.size();
        StringBuilder str = new StringBuilder();
        while(size-- > 0){
            int max = 0;
            char c = 'a';
            for(Map.Entry<Character,Integer> e : mp.entrySet()){
                int value = e.getValue();
                if(max<value){
                    max = value;
                    c = e.getKey();
                }
            }
            mp.remove(c);
            for(int i=1;i<=max;i++){
                str.append(c);
            }


        }
        return str.toString();
        
    }
}