class Solution {
    public int trap(int[] height) {
        int result=0;
        if(height.length<=2)return result;
        int left[]=new int[height.length];
            int right[]=new int[height.length];
        
        int max=height[0];
        
        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max=height[i];
                left[i]=max;
            }
            else{
                left[i]=max;
            }
        }
        
        int max2=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=max2){
                max2=height[i];
                right[i]=max2;
            }
            else{
                right[i]=max2;
            }
        }
        for(int i=0;i<height.length;i++){
            result+=Math.min(left[i],right[i])-height[i];
        }
        return result;
    }
    
}