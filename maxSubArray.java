class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0;
           
           int max=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
               sum+=arr[i];
               if(max<sum){
                   max=sum;
               }
               if(sum<0){
                   sum=0;
               }
               
           }
           System.out.println(max);
        return max;
    }
}