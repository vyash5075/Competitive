class Solution {
    public boolean isHappy(int n) {
         int temp=n;
             //int temp=n;
             while(temp!=1&&temp!=4){
                 temp=sqsum(temp);
             }
             if(temp==1){
               return true;
             }
             else{
                 return false;
             }
    }
    
     public static int sqsum(int n){
             
             int sum=0;
             while(n!=0){
                 int d=n%10;
                 n=n/10;
                 sum=sum+d*d;
             }
             return sum;
         }
}