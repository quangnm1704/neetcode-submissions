class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String x : strs){
            sb.append(x.length()).append("#").append(x);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List <String> decode = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int hashIndex = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, hashIndex));

            int start = hashIndex + 1;
            int end = start + length;

            decode.add(str.substring(start, end));

            i = end;
        } 
        return decode;
    }
}
