class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n - 1;
        int maxArea = (right - left) * Math.min(heights[left], heights[right]);
        int area = (right - left) * Math.min(heights[left], heights[right]);

        while(left < right){
            if(heights[left] < heights[right]){
                ++left;
            }
            else --right;

            area = (right - left) * Math.min(heights[left], heights[right]);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
