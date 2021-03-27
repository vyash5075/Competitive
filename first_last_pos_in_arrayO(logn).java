class Solution {
    public int[] searchRange(int[] arr, int target) {
        int firstpos=arr.length;
        int lastpos=0;
        int startindex=0;
        int endindex=0;
        int sum=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag++;
            firstpos=  Math.min(firstpos, i);
            lastpos=   Math.max(lastpos,i);
            }  
        }
        if(flag==0){
            firstpos=-1;
            lastpos=-1;
        }
        int a[]=new int [2];
        a[0]=firstpos;
        a[1]=lastpos;
        
        return a;
    }
}