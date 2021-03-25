
package competitive;

import java.util.*;
public class RomantoInteger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
        
        convertotroman(s);
    }
    public static void convertotroman(String str){
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
       hm.put("M",1000);
       hm.put("CM",900);
       hm.put("D",500);
       hm.put("CD",400);
       hm.put("C",100);
       hm.put("XC",90);
       hm.put("L",50);
       hm.put("XL",40);
       hm.put("X",10);
       hm.put("IX",9);
       hm.put("V",5);
       hm.put("IV",4);
       hm.put("I",1); 
       // Initialize result
        int res = 0;
 
        for (int i = 0; i < str.length(); i++)
        {
             
            int s1 = hm.get(str.charAt(i)+"");

            if (i + 1 < str.length())
            {
                int s2 = hm.get(str.charAt(i + 1)+"");
                if (s1 >= s2)
                {
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }
 
        System.out.print(res);
    }
    
    
    
}
