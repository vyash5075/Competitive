
package competitive;

import java.util.*;
public class IntegertoRoman {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        convertotroman(n);
    }
    public static void convertotroman(int n){
        
        int numbers[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman="";
        String letter[]={ "M",  "CM",  "D",  "CD", "C",  "XC","L",  "XL",  "X",  "IX", "V",  "IV", "I" };
        for(int i=0;i<numbers.length;i++){
            while(n>=numbers[i]){
                    n=n-numbers[i];
                   roman= roman.concat(letter[i]);
            }
        }
         System.out.println("Roman: " + roman.toString());

    }
    
    
    
}
