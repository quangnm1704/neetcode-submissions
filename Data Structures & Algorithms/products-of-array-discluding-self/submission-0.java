class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];

        // init left array
        for(int i = 0; i < n; i++){
            if(i == 0){
                left[i] = 1;
            }
            else{
                left[i] = left[i-1] * nums[i-1];
            }
        }

        // init right array
        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1) right[i] = 1;
            else{
                right[i] = right[i+1] * nums[i+1];
            }
        }

        for(int i = 0; i < n; i++) res[i] = left[i] * right[i];
        return res;
    }
}  
