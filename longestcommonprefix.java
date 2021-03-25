/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;
import java.util.*;
public class longestcommonprefix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[]={"reflower","flow","flight"};
        String arr1[]=new String[0];
       String ssss=longestcommonprefix(arr);
       System.out.println(ssss);
        
    }
    public static String longestcommonprefix(String arr[]){
         if(arr.length==0){
             return "";
         }
         else{
              String s="";
        int flag=1;
        int k=0;
        int l=arr[0].length();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<l){
                l=arr[i].length();
                k=i;
            }
        }
       
        for(int i=0;i<l;i++){
            char ch=arr[k].charAt(i);
             System.out.println(ch);
            for(int j=0;j<arr.length;j++){
                if(ch==arr[j].charAt(i)){
                   
                    flag=1;
                    continue;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                break;
            }
            if(flag==1){
                s+=ch;
            }
        }
        return s;
         }