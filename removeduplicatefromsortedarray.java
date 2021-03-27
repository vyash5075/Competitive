class Solution {
    public int removeDuplicates(int[] arr) {
        
       if(arr.length==1){
           System.out.println("as");
       }
       LinkedHashSet<Integer>l=new LinkedHashSet<Integer>();
       for(int i=0;i<arr.length;i++){
           l.add(arr[i]);
       }
       int k=0;
       for(int a:l){
         
           arr[k]=a;
           k++;
       }
       
       
      return l.size();
    }
}