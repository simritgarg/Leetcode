class Solution {
    public int countPrimes(int n) {
        int count = 2;
        if(n<=1) return 0;
        if(n==2) return 0;
        if(n==3) return 1;
        for(int i=4;i<n;i++){
            if(checkPrime(i)){
                count++;
            }
        }
        return count;
    }
    public boolean checkPrime(int num){
            for(int j=2;j*j<num;j++){
                if(num%j==0) return false;
            }
            return true;
        }

    }