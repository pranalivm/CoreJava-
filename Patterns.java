// import java.util.* ;


public class Patterns {

    public static void numberPyramid(int n) {
        //space + no.

        for(int i=1;i<=n;i++) {
            //spaces 
            for(int j=1 ; j<=2*(n-i) ; j++ ) {
                System.out.print(" ");
            }
            //no.
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

        public static void palindromicPattern(int n ) {
            //spaces + number

            for(int i=1;i<=n;i++) {
                for(int j=1;j<=2*(n-i);j++) {
                    System.out.print(" ");
                }

                for(int j=i;j>=1;j--) {
                    System.out.print(j);
                }

                for(int j=2 ; j<=i;j++) {
                    System.out.print(j);
                }
                System.out.println();




             }

        }

   


    public static void main(String args[]) {
        // numberPyramid(5);
        palindromicPattern(5);
        

    }
    
}
