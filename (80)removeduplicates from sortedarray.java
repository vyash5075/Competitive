class Solution {
    public int removeDuplicates(int[] nums) {
        
                 int i=0;
        int j=i+1;
        
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(i==0){
                    i++;
                    j++;
                }
                else if(nums[i]==nums[i-1]){
                    j++;
                }
                else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
               
            }
             else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
        }
        return i+1;
    }
}