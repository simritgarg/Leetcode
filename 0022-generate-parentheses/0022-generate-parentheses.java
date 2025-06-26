class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }
    // start is openBrackets and end is the closing brackets
    public void backtrack(String s, int start, int end, int n, List<String> res){
        // if(start == n && end == n){
        //     res.add(s);
        //     return;
        // }
        if(start == end && start + end == 2*n) res.add(s);
        if(start < n) backtrack(s+'(',start+1,end,n,res);
        if(end < start) backtrack(s+')',start,end+1,n,res);
    }
}