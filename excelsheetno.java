class Solution {
    public String convertToTitle(int cn) {
        
        StringBuilder cc=new StringBuilder();
        while(cn>0){
            int rem=cn%26;
            if(rem==0){
                cc.append("Z");
                cn=(cn/26)-1;
                
            }
            else{
                cc.append((char)((rem - 1) + 'A'));
                cn=cn/26;
            }
            
        }
        
        return cc.reverse().toString();
        
    }
}