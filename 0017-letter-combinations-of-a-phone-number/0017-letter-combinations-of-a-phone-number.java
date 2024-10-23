class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        StringBuilder temp = new StringBuilder();
        checkCombinations(res,temp,digits,0, mp);
        return res;
    }
    private void checkCombinations(List<String> res, StringBuilder temp, String digits, int index, HashMap<Integer,String> mp){
        if(index >= digits.length()){
            res.add(temp.toString());
            return;
        }
        String str = mp.get(Character.getNumericValue(digits.charAt(index)));
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            checkCombinations(res,temp,digits,index+1,mp);
            temp.deleteCharAt(temp.length()-1);
        } 
    }
}