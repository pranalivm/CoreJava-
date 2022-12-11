import java.util.* ;;

public class Assignment {

    public static boolean containsDuplocate(int[] nums ) {
       HashSet<Integer> set = new HashSet<>();

       for(int i=0;i<nums.length;i++) {
        if(set.contains(nums[i])) {
            return true ;
        }
        else {
            set.add(nums[i]);
        }
       }

       return false ; 
    
    
    
    
    }

    public static int maxProfit(int[] prices) {
        int buy= prices[0] ;
        int profit=0 ;

        for(int i=1;i<prices.length;i++) {
            if(buy<prices[i] ) {
                profit = Math.max(prices[i]-buy, profit);
            }
            else {
                buy = prices[i];
            }
        }
        return profit ;
    }

    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayListss<List<Integer>>() ;

            for(int i=0;i<nums.length;i++) {
                for(int j=i+1;i<nums.length;j++) {
                    for(int k=j+1;k<nums.length;k++) {
                        if(nums[i] + nums[j] + nums[k] ==0 ) {
                            List<Integer> triplet = new ArrayListss <Integer> () ;

                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            Collections.sort(triplet);
                            result.add(triplet) ;
                        }
                    }
                }
            }
            result = new ArrayListss<List<Integer>> (new LinkedHashSet<List <Integer >>(result)) ;
            return result ;



        
      
    }












    

    public static void main(String[] args) {
        
    }
    
}
