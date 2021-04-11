class Solution {
    public boolean isUgly(int n) {
        
        if(n<=0)return false;
       boolean r=true;
             
             while(n>0){
                 if(n==1){
                     r=true;
                     break;
                 }
                 System.out.println(n+",");
                 if(n%2==0){
                     n=n/2;
                     
                 }
                else if(n%3==0){
                     n=n/3;
                 }
                  else if(n%5==0){
                     n=n/5;
                 }
                else if(n%2!=0||n%3!=0||n%5!=0){
                     r=false;
                     break;
                 }
               
             }
            return r;

    }
}