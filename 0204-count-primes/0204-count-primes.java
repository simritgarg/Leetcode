class Solution {
    public int countPrimes(int n){
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }
        for(int i=2;i*i<n;i++){
            if(prime[i])
            {
                for(int j=i*i;j<n;j+=i){
                    prime[j] = false;
                }

            }
        }
         for (int i = 3; i * i < n; i += 2) {
            if (prime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}