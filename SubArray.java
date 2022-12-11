public class SubArray {


    public static void kedanes(int numbers[]) {
        int ms= Integer.MIN_VALUE ; 
        int cs= 0 ;

        for(int i=0;i<numbers.length; i++) {
            cs = cs + numbers[i] ;

            if(cs < 0) {
                cs =0 ;
            }

            ms = Math.max(cs,ms) ;

        }
        System.out.println("Our max subarray is : "+ms);
    }

    public static void main(String[] args) {

        // int currSum = 0 ;
        int numbers[]= {1,2,3,4,5} ;
        kedanes(numbers);



        // maxSubarraySum(numbers);
    }
}
