class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0)
            {
                return false;
            }
        while(n!=0)
        {
            if(n==1)
            {
                return true;
            }
            
            int x = n%2;
            if(x!=0 )
            {
                return false;
            }
            n = n/2;
        }
        return true;
        
    }
};