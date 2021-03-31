class Solution {
    public int[][] generateMatrix(int k) {
        int matrix[][]=new int[k][k];
       
   
        
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
            int sum=0;
        while(m>0 && n>0){
 
            //if one row/column left, no circle can be formed
            if(m==1){
                
                for(int i=0; i<n; i++){
                    sum++;
                    matrix[x][y++]=sum;
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    sum++;
                    matrix[x++][y]=sum;
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                sum++;
                matrix[x][y++]=sum;
            }
 
            //right - move down
            for(int i=0;i<m-1;i++){
                
                sum++;
                matrix[x++][y]=sum;
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                sum++;
               matrix[x][y--]=sum;
            }
 
            //left - move up
            for(int i=0;i<m-1;i++){
                sum++;
            matrix[x--][y]=sum;
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return matrix;
    }

}