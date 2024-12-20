class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        // why we can't sort hashmap -> it use hashset internally -> fetch data using hashcode
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }
        int size = mp.size();
        StringBuilder sb = new StringBuilder();
        while(size-- > 0){
            int max = 0;
            char c = 'a';
            for(Map.Entry<Character,Integer> entry : mp.entrySet()){
                int val = entry.getValue();
                if(val>max){
                    max = val;
                    c = entry.getKey();
                }
            }
            mp.remove(c);
            for(int i=1;i<=max;i++){
                sb.append(c);
            }
        }
        return sb.toString();
        

    }
}