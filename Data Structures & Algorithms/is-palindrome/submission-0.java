class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanStr);
        sb.reverse();

        String t = sb.toString();
        return t.equals(cleanStr);
    }
}
