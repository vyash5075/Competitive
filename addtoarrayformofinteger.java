class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
         String str="";
             int i=num.length-1;
             int c=0;
            while(i>=0||k>=0){
                 if(i<0&&k==0){
                     break;
                 }
                 int lastdigit=k%10;
                 k=k/10;
                 
                 int sum=0;
                 if(i<0){
                    
                     sum=0+c+lastdigit;
                 }
                 else{
                    
                     sum=num[i]+c+lastdigit;
                 }
                 int res=sum%10;
                 c=sum/10;
                 str=str+res+"";
                 i--;
             }
             if(c!=0){
                 str=str+c+"";
             }
             System.out.println(new StringBuilder(str).reverse().toString());
             System.out.println(str.length());
            List<Integer>al=new ArrayList<Integer>();
        for(int l=str.length()-1;l>=0;l--){
           String s=str.charAt(l)+"";
            al.add(Integer.parseInt(s));
        }
        return al;
    }
    
    
    
    
    
    
    
    
    
    
    
    
     public String addBinary(String a, String b) {
       // Resultant String
        StringBuilder result = new StringBuilder();
        // Indices for a and b
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Carry
        int carry = 0;
        while (i >= 0 || j >= 0) {
            // Sum of two bits
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            // Add the bit to the result
            result.insert(0, sum % 10);
            // Modify carry
            carry = sum / 10;
        }
        // Final check if carry exists
        if (carry > 0) {
            result.insert(0, 1);
        }
        return result.toString();
        
    }
}