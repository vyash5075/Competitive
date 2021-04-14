class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>al=new ArrayList<Integer>();
        
        int row;
        int col;
        if(matrix[0].length==1){
            int max=matrix[0][0];
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]>max){
                    max=matrix[i][0];
                }
                
            }
            al.add(max);
            return al;
        }
        for(int i=0;i<matrix.length;i++){
            row=matrix[i][0];
            col=row;
            int index=0;
            for(int k=0;k<matrix[i].length;k++){
                if(matrix[i][k]<row){
                    row=matrix[i][k];
                    col=row;
                    index=k;
                    System.out.println(row);
                }
            }
            
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][index]>row){
                    col=matrix[j][index];
                    System.out.println(col);
                }
            }
            
            if(row==col){
                al.add(row);
                break;
            }
            
        }
        return al;
        
    }
}