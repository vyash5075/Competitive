class Solution {
    public void setZeroes(int[][] arr) {
         boolean arr1[][]=new boolean[arr.length][arr[0].length];
          
             for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr[0].length;j++){
                     if(arr[i][j]==0){
                       
                         arr1[i][j]=true;
                     }
                     else{
                        
                         arr1[i][j]=false;
                     }
                 }
             }
             
             for(int i=0;i<arr1.length;i++){
                 for(int j=0;j<arr1[0].length;j++){
                     if(arr1[i][j]==true){
                         System.out.println(i+""+j);
                         for(int k=0;k<arr[0].length;k++){
                             System.out.println(i+" "+k);
                             arr[i][k]=0;
                         }
                         for(int p=0;p<arr.length;p++){
                             arr[p][j]=0;
                         }
                     }
                 }
             }
    }
}