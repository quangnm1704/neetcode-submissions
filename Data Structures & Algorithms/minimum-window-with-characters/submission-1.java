public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        
        int[] countT = new int[256];
        int[] window = new int[256];

        for(char c : t.toCharArray()){
            countT[c]++;
        }
        int need = 0;
        for(int x : countT){
            if(x > 0) need++;
        }

        int left = 0;
        int startIndex = 0;
        int have = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < s.length(); right++){
            char charRight = s.charAt(right);
            window[charRight]++;
            if(countT[charRight] > 0 && window[charRight] == countT[charRight]){
                ++have;
            }

            while(have == need){
                int currentLen = right - left + 1;
                if(currentLen < minLen){
                    minLen = currentLen;
                    startIndex = left;
                }

                char charLeft = s.charAt(left);
                window[charLeft]--;

                if(countT[charLeft] > 0 && window[charLeft] < countT[charLeft]){
                    --have;
                }
                ++left;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";
        else return s.substring(startIndex, startIndex + minLen);
    }
}

