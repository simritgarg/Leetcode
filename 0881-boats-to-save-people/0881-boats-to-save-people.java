class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        int count = 0;
        Arrays.sort(people);
        while(left <= right){
            if(people[right] + people[left] <= limit){
               // count++;
                left++;
            }
            // else if(left==right){
            //     count++;
            // }
            // else{
                // count++;
            // }
            right--;
            count++;
            
        }
        return count;
    }
}