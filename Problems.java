public class Problems {

    // private static int[] letfMax;

    public static int trappedRainwater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            // int[] letfMax;
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {

           
            rightMax[i] = Math.max(height[i], rightMax[i+1]) ;
        }
        int trappedWater = 0;
            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]);

                 trappedWater += waterLevel - height[i];
            
           
        }
        return trappedWater;
        

    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0 ;

        for(int i=0;i<prices.length;i++) {
            if(buyPrice<prices[i]) {
                int profit = prices[i] - buyPrice ;
                maxProfit= Math.max(maxProfit, profit) ;
            }

            else {
                buyPrice= prices[i] ;
            }
        }
        return maxProfit ; 
    }




  

    

    public static void main(String[] args) {
       int prices[] = {7,1,5,3,6,4} ;
       System.out.println(buyAndSellStocks(prices));





    }
}