class Solution {
    public boolean isValid(String s) {
          if(s.length()==0||s.length()==1){
                return false;
            }
            
            boolean flag=true;
            Stack<Character>st=new Stack<Character>();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='{'||c=='['||c=='('||c=='<'){
                    st.push(c);
                    System.out.println(c+" "+st.size());
                }
                else{
                    
                    if(st.size()>=1&&c=='}'&&st.peek()=='{'&&st.size()>=1){
                        st.pop();
                    }
                    else if(st.size()>=1&&st.size()>=1&&c==')'&&st.peek()=='('){
                        st.pop();
                    }
                    else if(st.size()>=1&&c==']'&&st.peek()=='[' &&st.size()>=1){
                        st.pop();
                    }
                     else if(st.size()>=1&&c=='>'&&st.peek()=='<' &&st.size()>=1){
                        st.pop();
                    }
                     else{
                         return false;
                     }
                }
            }
            if(st.size()==0){
               return true; 
            }
           
            return false;
        
    }
}