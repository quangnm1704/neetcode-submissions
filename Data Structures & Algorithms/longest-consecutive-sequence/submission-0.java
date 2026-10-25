class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int maxLength = 0;

        for(int x : set){
            if(!set.contains(x - 1)){
                int currentNum = x;
                int length = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
