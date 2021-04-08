class Solution {
    public int compress(char[] arr) {
        
       String s=arr[0]+"";
             
        if(arr.length==1){
            return 1;
        }
        int count=1;
        int count2=1;
        boolean flag=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                count2++;
                if(count>1){
                    s=s+count;
                }
               
                s=s+arr[i];
                
                count=1;
            }
            else{
                count++;
                flag=true;
            }
            
        }
         if(count>1){
                    s=s+count;
                }
       
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            arr[i]=(char)(s.charAt(i));
        }
        
        // if(flag){
        //      return count2*2;
        // }
       
         return s.length();
    }
}