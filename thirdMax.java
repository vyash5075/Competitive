class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        
        
        int l=nums.length;
      int max=nums[l-1];
        int count=1;
        for(int i=l-1;i>=0;i--){
            if(count==3){
                break;
            }
            if(nums[i]<max){
                count++;
                max=nums[i];
            }
        }
        
        if(count!=3){
            return nums[l-1];
        }
        return max;
    }
}