class Solution {
   public int maxArea(int[] height) {
	if (height == null || height.length < 2) {
		return 0;
	}
 
	int max = 0;
	int left = 0;
	int right = height.length - 1;
 
	while (left < right) {
		max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
		if (height[left] < height[right])
			left++;
		else
			right--;
	}
 
	return max;
}
    
}
------------------------------------------
//way 2 longway 

 public static void maxarea(int arr[]){
       int area=0;
       int len=0;
       int wid=0;
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               int width=arr.length-j-1;
               int  length=arr[i]+arr[width+j];
               
               int k=arr[i];
               
               if(arr[width+i]<arr[i]){
                   k=arr[width+i];
               }
               
               int a=k*width;
               System.out.println(width+" "+k+" "+a);
                 if(area<a){
                     area=a;
                 }
           }
       }
      System.out.println(area);
  return area;
   }