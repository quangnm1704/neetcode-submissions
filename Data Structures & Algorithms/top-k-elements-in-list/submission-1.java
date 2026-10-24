class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List <Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) ->{
            if(a.getValue() > b.getValue()) return -1;
            else if(a.getValue() < b.getValue()) return 1;
            else return 0;
        });

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}
