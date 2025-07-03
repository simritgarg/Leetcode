class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        backtrack(s, 0, 0, n, res);
        return res;
    }
    // start is openBrackets and end is the closing brackets
    public void backtrack(StringBuilder s, int start, int end, int n, List<String> res){
        // if(start == n && end == n){
        //     res.add(s);
        //     return;
        // }
        // OR
        if(start == end && start + end == 2*n) res.add(s.toString());
        if(start < n){
            backtrack(s.append('('),start+1,end,n,res);
            s.deleteCharAt(s.length()-1);
        } 
        if(end < start){
            backtrack(s.append(')'),start,end+1,n,res);
            s.deleteCharAt(s.length()-1);
        } 
    }
}

// To increase the time complexity we will usethe string builder