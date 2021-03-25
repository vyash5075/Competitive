class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1)
        {
            return s;
        }
        else{
            
        
        int maxlength=1;
        int low=0;
        int high=0;
        int start=0;
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            low=i-1;
             high=i;
            while(low>=0&&high<n&&s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxlength)
                {
                    start=low;
                    maxlength=high-low+1;
                }
                --low;
                ++high;
               
            }
              low=i-1;
             high=i+1;
             while(low>=0&&high<n&&s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxlength)
                {
                    start=low;
                    maxlength=high-low+1;
                }
                --low;
                ++high;
               
            }
            
        }
        String str=s.substring( start,start+maxlength);
        return str;
        }
    }
}