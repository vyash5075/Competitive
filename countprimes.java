class Solution {
    public int countPrimes(int n) {
        
        int count=0;
        if (n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        
        if(n==2){
            return 0;
        }
        
         boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++)
        {
           
            if (prime[p] == true)
            {
                
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
      //  int count=0;
        for (int i = 2; i < n; i++)
        {
            if (prime[i] == true)
               count++;
        }
        return count;
       
        }
    
        
    
}