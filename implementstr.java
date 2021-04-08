class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()==0&&haystack.length()==0){
            return 0;
        }
        int N=haystack.length();
        int M=needle.length();
        for(int i=0;i<=N-M;i++){
            int j;
            for( j=0;j<M;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                
            }
            if(j==M){
                return i;
            }
        }
        return -1;
    }
}