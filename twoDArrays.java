import java.util.* ;

public class twoDArrays {

    public static boolean search(int matrix[][],int key) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==key) {
                    System.out.println("found at cell: ("+i+1+","+j+1+")");
                    return true ;
                }
            }
        }
        System.out.println("key not found");
        return false ;
    }

    public static void largestSmallest(int matrix[][]) {
        int max= Integer.MIN_VALUE ;
        int min= Integer.MAX_VALUE ;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j] ;
                }
                 if(matrix[i][j] < min){
                    min = matrix[i][j] ;
                    
                }
              
            }
            
        }
        System.out.println("Min element : "+min+"     MAx = "+max);
        
    }
    

    public static void printSpiral(int matrix[][]) {
        int startRow= 0;
        int startCol =0 ;
        int endCol = matrix[0].length-1 ;
        int endRow = matrix.length-1 ;

        while(startRow <= endRow && startCol<=endCol) {

            for(int j=startCol; j<=endCol ; j++) {
                System.out.print(matrix[startRow][j]+"");
            }

            for(int i=startRow+1; i<=endRow;i++) {
                System.out.print(matrix[i][endCol]+"");
            }

            for(int j=endCol-1 ;j>= startCol;j--) {
                if(startRow == endRow) {
                    break ;
                }
                System.out.print(matrix[endRow][j]+"");

            }

            for(int i=endRow-1;i>=startRow+1;i--) {
                if(startRow == endRow) {
                    break ;
                }
                System.out.print(matrix[i][startCol]+"");


            }
            startCol++ ;
            startRow++ ;
            endRow-- ;
            endCol-- ;
        }




    }


    public static int diagonalSum(int matrix[][]) {
        int sum=0 ;

        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;i<matrix[0].length;j++) {
        //         if(i==j) {
        //             sum +=matrix[i][j] ;
        //         }

        //         else if(i+j == matrix.length-1) {
        //             sum +=matrix[i][j] ;
                    

        //         }
               
        //     }
        // }
        // System.out.println("Sum is " +sum);
        // return sum;

        for(int i=0;i<matrix.length;i++) {
            sum += matrix[i][i] ;

            if(i!=matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1] ;
            }
        }


        return sum ;



    }

    public static boolean staircaseSearch(int matrix[][] , int key) {
        int row=0,col= matrix[0].length-1 ;

        while(row< matrix.length && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("found at key (" +row+ ","+col+")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col-- ;
            }
            else {
                row++ ;
            }
            
        }
        //  sum +=matrix[i][j] ;
        System.out.println("Key not found");
        return false ;

       
    }

    // Q.3

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.println(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        int matrix[][] = {{1,0,3,7,4},
                            {1,2,3,7,4}};
        int key = 2 ;

        int n= matrix.length , m= matrix[0].length;
        
        
        // for(int i=0; i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int row= 2, col =5 ;

        int[][] transpose = new int[col][row] ;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                transpose[j][i] = matrix[i][j] ;
            }
        }

        printMatrix(matrix);

        
        // for(int i=0; i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }






        
        
    }
}


