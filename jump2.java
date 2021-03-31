class Solution {
   public int jump(int[] arr) {
       int n=arr.length;
        int jumps[] = new int[n];
        // result
        int i, j;
 
        // if first element is 0,
        if (n == 0 || arr[0] == 0)
            return 0;
        // end cannot be reached
 
        jumps[0] = 0;
 
        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j]&& jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1];
    }
}