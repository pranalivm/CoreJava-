public class Recursion {

    public static void printDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }

        System.out.println(n+""); 
        printDec(n-1); //9
    }

    public static void printInc(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }


        
        printInc(n-1);
        System.out.println(n+"");

    }

    public static int fact(int n) {
        if(n==0) {
            return 1;
        }

        int fnm1= fact(n-1);
        int fn= n * fnm1;
        return fn;
    }

    public static int sum(int n) {

        if(n==1) {
            return 1;

        }

        int fnm1= sum(n-1);
        int fn= n + fnm1;
        return fn ;
    }

    public static int fib(int n) {

        if(n==0 | n==1) {
            return n;
        }

        int fnm1 =fib(n-1);
        int fnm2 = fib(n-2);
        int fibn = fnm1 + fnm2 ;

        return fibn;
    }

    public static boolean isSorted(int arr[], int i) {

        if(i==arr.length-1) {
            return true ;
        }

        if(arr[i]>arr[i+1]) {
            return false ;
        }

        return isSorted(arr, i+1);
    }

    

    public static int firstOccur(int arr[],int key, int i) {

       if (arr[i] == key) 
            return -1;

        return firstOccur(arr, key, i+1);


    }


    public static int lastOccur(int arr[], int key,int i) {

        if(i==arr.length)  {
            return -1 ;
        }

        int isFound = lastOccur(arr, key, i+1);

        if(isFound ==-1 && arr[i]==key ) {
            return i;
        }

        return isFound;


    }

    public static int power(int x, int n) {
        if(n==0) {
            return 1 ;
        }
        int xnm1,xn;

        xnm1 = power(x, n-1);
        xn = x*xnm1;
        return xn ;


    }

    public static int optPow(int a, int n) {

        if(n==0) {
            return 1 ;
        }

        int halfPow = optPow(a, n/2);
        int halfPowSq =halfPow*halfPow ;

        if(n%2 !=0) {
            halfPowSq =a * halfPow;

        }
        return halfPowSq;
    }

    public static int tilingProblem(int n) {
        if(n==0 | n==1) {
            return 1;
        }

        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2 ;

        return totalWays;


    }


    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx==str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a']  == true) {

            removeDuplicates(str, idx+1, newStr, map);
        }

        else {
            map[currChar - 'a'] = true ;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {

        if(n==1 | n==2) {
            return n;
        }

        int fnm1 = friendsPairing(n-1);
        int fnm2= friendsPairing(n-2);

        int pairWays= (n-1) * fnm2 ;

        int totalWays= fnm1 + pairWays ;

        return totalWays;


    }

    public static void printBinStrings(int n, int lastPlace, String str) {

        if(n==0) {

            System.out.println(str);
            return ;
        }

        printBinStrings(n-1, 0, str+1);

        if(lastPlace==0) {
            printBinStrings(n-1, 1, str+"1");
        }
    }


    public static void allOccurences(int arr[], int key, int i) {

        if(i==arr.length) {
            return ;
        }

        if(arr[i] ==key ) {
            System.out.println(i+"");
        }

        allOccurences(arr, key, i+1);
    }

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};


    public static  void printDigits(int number) {
        if(number==0) {
            return ;
        }

        int lastDigit = number%10;

        printDigits(number/10);

        System.out.println(digits[lastDigit]+"");
     }


     public static int length(String str) {
        if(str.length() ==0) {
            return 0;

        }

        return length(str.substring(1))+1 ;

     }

     public static int countSubstr(String str, int i, int j, int n) {
        if(n==1) {
            return 1;
        }

        if(n<=0) {
            return 0;
        }

        int res = countSubstr(str, i+1, j, n-1) +
                countSubstr(str, i, j-1, n-1) + countSubstr(str, i+1, j-1, n-2);

                if(str.charAt(i) == str.charAt(j)) {
                    res++ ;
                }

                return res;



     }

     public static void towerOfHanoi(int n,String src, String helper, String dest) 
     {
        if(n==1) {
            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
            return ;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);

        towerOfHanoi(n-1, helper, src, dest);


     } 

     



    public static void main(String[] args) {
        
        String str="abcde" ;
        // System.out.println(length(str));

        int n= str.length();
        // System.out.println(countSubstr(str, 0, n-1, n));

        towerOfHanoi(3, "src", "helper", "dest");









    }
    
}
