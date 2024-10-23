class Solution {
    private boolean recursion(int[] arr,int index,int target,int side1,int side2,int side3,int side4){
        if(index==arr.length)return true;
        if(arr[index]+side1<=target){
            side1+=arr[index];
            if(recursion(arr,index+1,target,side1,side2,side3,side4))return true;
            side1-=arr[index];
        }
        if(arr[index]+side2<=target){
            side2+=arr[index];
            if(recursion(arr,index+1,target,side1,side2,side3,side4))return true;
            side2-=arr[index];
        }
        if(arr[index]+side3<=target){
            side3+=arr[index];
            if(recursion(arr,index+1,target,side1,side2,side3,side4))return true;
            side3-=arr[index];
        }
        if(arr[index]+side4<=target){
            side4+=arr[index];
            if(recursion(arr,index+1,target,side1,side2,side3,side4))return true;
            side4-=arr[index];
        }
        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length<4)return false;
        int sum = 0;
        for(int i=0;i<matchsticks.length;i++){
            sum+=matchsticks[i];
        }
        int target=0;
        if(sum%4!=0){
            return false;
        }
        else{
            target=sum/4;
        }
        // Arrays.sort(matchsticks,(a,b)->{
        //     return b-a;
        // });
        Arrays.sort(matchsticks);
        int[] match=new int[matchsticks.length];
        int s =0;
        for(int i=matchsticks.length-1;i>=0;i--){
            match[s]=matchsticks[i];
            s++;
        }
        return recursion(match,0,target,0,0,0,0);
    }
}