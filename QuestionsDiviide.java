import javax.swing.text.AbstractDocument.LeafElement;

public class QuestionsDiviide {

    // public static String[] mergeSort(String[] arr,int lo,int hi) {

    //     if(lo==hi) {
    //         String[] A= { arr[lo]};
    //         return A;
    //     }

    //     int mid= lo + (hi-lo) /2 ;
    //     String[] arr1 = mergeSort(arr, lo, mid);
    //     String[] arr2 = mergeSort(arr, mid+1, hi);

    //     String[] arr3 = merge(arr1,arr2) ;

    //     return arr3;
    // }

    // public static String[] merge(String[] arr1, String[] arr2) {

    //     int m=arr1.length;
    //     int n=arr1.length;

    //     String[] arr3 = new String[m+n];

    //     int idx=0;

    //     int i=0,j=0;

    //     while(i<m && j<n) {
    //         // if((isAlphabeticallySmaller(arr1[i],arr2[j]))) {
    //             arr3[idx] = arr1[i];
    //             i++ ;
    //             idx++ ;
    //         }

    //         else {
    //             arr3[idx] = arr2[j];
    //             j++ ;
    //             idx++ ;
    //         }
    //     }
    //     while(i<m) {
    //         arr3[idx] = arr1[i] ;
    //         i++;
    //         idx++ ;
    //     }
    //     while(j<n) {
    //         arr3[idx] = arr2[j];
    //         j++;
    //         idx++ ;
    //     }
    //     return arr3;

    // }

    // static boolean isAlphabeticallySmaller(String str1, String str2 ) {
    //     if(str1.compareTo(str2) < 0) {
    //         return true ;
    //     }

    //     return false;
    // }


    // public static int majorityElement(int[] nums) {
    //     int majorityCount= nums.length/2 ;

    //     for(int i=0;i<nums.length;i++) {
    //         int count =0 ;
    //         for(int j=0;j<nums.length;j++) {
    //             if(nums[j]==nums[i]) {
    //                 count = count+1 ;
    //             }
    //         }

    //         if(count> majorityCount) {
    //             return nums[i] ;
    //         }

          
    //     }
    //     return -1 ;
    // }
    
    private static int countInRange(int[] nums, int num,int lo, int hi) {
        int count=0;

        for(int i=lo;lo<=hi;i++) {
            if(nums[i] == num ) {
                count++ ;
            }
        }
        return count;
    }

    public static int majorityElementRec(int[] nums,int lo,int hi) {
        if(lo == hi) {
            return nums[lo] ;

        }

        int mid= (hi-lo)/2 + lo ;
        int left = majorityElementRec(nums, lo, mid ) ;
        int right = majorityElementRec(nums,mid+1,hi);

        if(left==right) {
            return left ;
        }
    

    int leftCount = countInRange(nums, left, lo, hi);
    int rightCount = countInRange(nums, right, lo, hi);

    return leftCount > rightCount ? left: right ;
}

    public static int majorityElement(int[] nums) {

        return majorityElementRec(nums, 0,nums.length-1);
    }

    public static int getInvCount(int arr[] ) {
        int n= arr.length;
        int invCount=0 ;

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++ ) {
                if(arr[i] > arr[j]) {
                    invCount++ ;
                }
            }
        }
        return invCount;
    }

    public static int merge(int arr[],int left, int mid, int right) {
        int i=left, j=mid, k=0 ;
        int invCount=0;

        int temp[]= new int[(right-left+1)];

        while((i<mid) && (j<=right)) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i] ;
                k++;
                i++ ;

            }

            else{
                temp[k] = arr[j] ;
                invCount += (mid-1) ;
                k++;
                j++ ;
             }
        }

        while(i<mid) {
            temp[k] = arr[i] ;
            k++;
            i++;
        }

        while(j<=right) {
            temp[k] = arr[j] ;
            k++;
            j++ ;
        }

        for(i=left,k=0; i<=right;i++ , k++) {
            arr[i] = temp[k] ;

        }

        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right) {
        int invCount=0 ;

        if(right>left) {
            int mid= (right+left)/2 ;

            invCount = mergeSort(arr, left, mid) ;
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr,left, mid+1,right);
        }

        return invCount ;
    }

    public static int getInversions(int arr[]) {
        int n= arr.length;
        return mergeSort(arr,0,n-1) ;
    }

    public static void main(String[] args) {
        
        // String[] arr= {"sun","earth","mars","mercury"};
        // String[] a = mergeSort(arr, 0, arr.length-1);

        // for(int i=0;i<a.length;i++) {
        //     System.out.println(a[i]);
        // }

        // int nums[] ={2,2,1,1,1,2,2};
        // System.out.println(majorityElement(nums));
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion count="+getInversions(arr));
        
    }
    
}
