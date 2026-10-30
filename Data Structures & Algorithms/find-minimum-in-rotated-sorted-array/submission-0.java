class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int res = 0;

        while(left <= right){
            if(left == right){
                res = nums[left];
                break;
            }
            int mid = (left + right) / 2;
            
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }

            else if(nums[mid] < nums[right]){
                right = mid;
            }
        }

        return res;
    }
}
