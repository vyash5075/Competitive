class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        
        if(!al.contains(1)){
            return 1;
        }
        
        int a=1;
        int flag=0;
        
        for(int i=0;i<nums.length;i++){
            a=a+1;
            if(al.contains(a)){
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        return a;
    }
}