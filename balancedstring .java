
package competitive;

import java.util.*;
public class balancedstring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        balanced(s);
    }
    
    public static void balanced(String str){
      int ans=0;
        int count=0;
       
              
        for(int i=0;i<str.length();i++){
             count=0;
            for(int j=i;j<str.length();j++){
               if(str.charAt(j)=='R'){
                count++;
            } 
               else{
                   count--;
               }
               if(j>=i&&count==0){
                   ans++;
                   i=j;
                   break;
               }
            }
        }
        System.out.println(ans);
    }
}
