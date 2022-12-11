// import java.net.SocketTimeoutException;
// import java.util.*;
// import java.util.Scanner;

// public static void update(int marks[] , int notchangeable) {
//     notchangeable= 10 ;

//     for(int i=0;i<marks.length;i++) {

//         marks[i] += 1 ;
//         // System.out.println(marks[i]);
//     }

// }

// public static int linearSearch(int numbers[], int key) {
//     for(int i=0;i<numbers.length;i++) {
//         if(numbers[i] == key ) {
//             return i ;
//         }

//     }

//     return -1;
// }

// public static int getLargest(int numbers[]) {

//     int largest = Integer.MIN_VALUE ; //-infinity
//     int smallest = Integer.MAX_VALUE  ;

//     for(int i=0;i<numbers.length;i++) {
//         if(largest < numbers[i]) {
//             largest = numbers[i] ;
//         }

//         if(smallest > numbers[i]) {
//             smallest  = numbers[i] ;

//         }
//     }

//     System.out.println("Smallest value = "+smallest);

//     return largest;

// }

// public static int binarySearch(int numbers[], int key) {
//     int start=0, end=numbers.length-1 ;

//     while(start <= end) {
//         int mid= (start+end)/2 ;

//         if(numbers[mid] == key) {
//             return mid;
//         }

//         if(numbers[mid] <key ) {
//             start = mid+1 ;
//         }

//         else {
//             start = mid-1 ;
//     }

//     }

//     return - 1 ;
// }

// public static void reverse(int numbers[] ) {
//     int first = 0, last = numbers.length-1; 

//     while(first < last) {
//         int temp= numbers[last] ;
//         numbers[last] = numbers[first] ;
//         numbers[first] = temp ;

//         first++ ;
//         last-- ;
//     }

// }

// public static void printPairs(int numbers[]) {
//     int tp=0;
//     for(int i=0;i<numbers.length;i++) {
//         int curr=numbers[i] ;

//         for(int j=i+1;j<numbers.length;j++) {
//             System.out.print("("+curr+","+numbers[j]+")");
//             tp++ ;

//         }
// //         System.out.println();
// //         System.out.println("Total pairs"+tp);
// //     }
// // }

// public static void printSubarrays(int numbers[]) {
//     int ts=0;

//     for(int i=0;i<numbers.length;i++) {
//        int start = i ;
//         for(int j=i;i<numbers.length;j++) {
//             int end= j ;

//             for(int k=start; k<=end;k++) {
//                 System.out.print(numbers[k]+" ");

//             }
//             ts++ ;
//             System.out.println();

//         }
//         System.out.println("Total subarrays"+ts);

//     }

public class Arrays {

    public static void maxSubarraySum(int numbers[]) {

            int currSum = 0;
            int maxSum = Integer.MIN_VALUE ;

            for(int i=0;i<numbers.length;i++) {
                int start=i ;

                for(int j=i; j<numbers.length;j++) {
                    int end= j ;
                    // currSum=0 ;

                    for(int k=start;k<=end;k++) {
                        currSum += numbers[k] ;
                    }

                    System.out.println(currSum);

                    if(maxSum < currSum) {
                        maxSum = currSum ;
                    }



                }

                
            }
            System.out.println("Max sum is "+maxSum);
        }

    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5} ;

        // maxSubarraySum(numbers);

        int prefix[] = new int[numbers.length] ;
        prefix[0] = numbers[0] ;

        for(int i=1;i<prefix.length;i++) {
            prefix[i] = prefix[i+1] + numbers[i] ;
        }


        for(int i=0;i<numbers.length;i++) {
            int start=i ;

            for(int j=i; j<numbers.length;j++) {
                int end= j ;
                // currSum=0 ;

                for(int k=start;k<=end;k++) {
                    
                }

                // System.out.println(currSum);

                


            }
        }
    }
}
