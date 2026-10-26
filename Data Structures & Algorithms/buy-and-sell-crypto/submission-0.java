class Solution {
    public int maxProfit(int[] prices) {
        List <Integer> list = new ArrayList<>();
        int n = prices.length;
      
        for(int i = 0; i < n - 1; i++){
            int maxProfit = 0;
            for(int j = i+1; j < n; j++){
                int profit = 0;
                if(prices[j] < prices[i]) continue;
                else{
                    profit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
            list.add(maxProfit);
        }
        
        if(list.isEmpty()) return 0;
        else{
            list.sort((a, b) ->{
                return b - a;
            });

            return list.get(0);
        }
    }
}
