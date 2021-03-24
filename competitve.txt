
package competitive;
import java.util.*;
public class longestsubstringwithoutrepeating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<Character>al=new ArrayList<Character>();
        int count=0;
        for(int i=0;i<str.length();i++){
            
            if(al.contains(str.charAt(i))){
                 if(al.size()>count){
                    count=al.size();
                }
              al.removeAll(al);
               al.add(str.charAt(i));
             
            }
            else{ 
                
                al.add(str.charAt(i));
                if(al.size()>count){
                    count=al.size();
                }
                 
            }
        }
        System.out.println(count);
    }
}
