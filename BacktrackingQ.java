public class BacktrackingQ {
    
    final static char[][] L = {{}, {},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}}; 

    public static void letterCombinations(String D) {
        int len= D.length();

        if(len ==0) {
            System.out.println("");
            return ;
        }

        bfs(0,len, new StringBuilder(),D) ;
    }

    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        if(pos == len) {
            System.out.println(sb.toString());
        }
        else {
            char[] letters  = L[Character.getNumericValue(D.charAt(pos))] ;

            for(int i=0;i<letters.length;i++) {
                bfs(pos+1,len, new StringBuilder(sb).append(letters[i]),D);
            }
        }
    }

    static int N=8 ;

    public static boolean isSafe(int x, int y, int sol[][]) {

        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==1) ; 
    }


    public static void printSolution(int sol[][]) {
        for(int x=0; x<N;x++) {
            for(int y=0;y<N;y++) {
                System.out.println(sol[x][y]+"");
            }
            System.out.println();
        }
    }


    public static boolean solveKT() {
        int sol[][] = new int[8][8] ;

        for(int x=0;x<N;x++) {
            for(int y=0;y<N;y++) 
                sol[x][y] = -1 ;

             int xMove []= {2,1,-1,-2,-2,-2,-1,-1,2} ;

            int yMove[] = {1,2,2,1,-1,-2,-2,-1} ;

            sol[0][0]=0 ;

            if(!solveKTUtil(0,0,1,sol,xMove,yMove)) {
                System.out.println("no solution");

                return false;
            }

            else {
                printSolution(sol);
            }



            
        }

        return true ;
    }

    public static boolean solveKTUtil(int x, int y, int movei,)

    public static void main(String[] args) {
        
        
    }
}
