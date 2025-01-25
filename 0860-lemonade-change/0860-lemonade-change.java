class Solution {
    public boolean lemonadeChange(int[] bills) {
        int totalAmt = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for(int bill: bills){
            if(bill == 5) countA++;
            else if(bill == 10){
                if(countA>0){
                    countA--;
                    countB++;
                }
                else return false;
            }
            else{
                if(countB>0 && countA>0){
                    countA--;
                    countB--;
                }
                else if(countA>2) countA -= 3;
                else return false;
                

            }

        }
        return true;
    }
}