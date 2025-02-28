class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr = asteroids[i];
            if(curr > 0){
                s.push(curr);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek() < -curr) s.pop();
                if(s.isEmpty() || s.peek() <0) s.push(curr);
                if(s.peek() == - curr) s.pop();
            }
        }
        int[] res = new int[s.size()];
        int x= res.length-1;
        while(!s.isEmpty()){
            res[x--] = s.pop();
        }
        return res;
    }
}