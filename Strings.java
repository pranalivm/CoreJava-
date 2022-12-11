import java.util.* ;
import java.util.Arrays; 

public class Strings {


    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i)+" ");

        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for(int i=0;i<str.length()/2;i++) {
            int n= str.length();

            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false ;
            }
        }
        return true; 
    }

    public static float getShortestPath(String path) {
        int x=0,y=0 ;

        for(int i=0;i<path.length();i++) {
            char dir= path.charAt(i) ;

            if(dir =='S' ) {
                y-- ;
            }
            else if(dir == 'N') {
                y++ ;
            }
            else if(dir== 'W') {
                x-- ;            }
        
            else {
            x++ ;
        }


    }

    int X2= x*x ;
    int Y2 =y*y ;

    return (float)Math.sqrt(X2 + Y2 ) ;
}

    public static String substring(String str, int si, int ei) {
        String substr =" " ;

        for(int i=si;i<ei;i++) {
            substr += str.charAt(i) ;
        }
        return substr ;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb= new StringBuilder(" ");

        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++) {
            if((str.charAt(i) == ' ') && i<str.length()-1) {
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i)));


            }
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();


    }


    public static String compress(String str) {
        String newStr = " " ;

        for(int i=0;i<str.length();i++) {
            Integer count = 1;

            while(i< str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                count++ ;
                i++ ;

            }

            newStr += str.charAt(i) ;

            if(count > 1) {
                newStr += count.toString();
            }
        }

        return newStr ;
    }
    
   





    public static void main(String[] args) {

       String str1 = "earth" ;
       String str2 = "heart" ;

       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       if(str1.length() == str2.length()) {
        char[] str1char = str1.toCharArray();
        char[] str2char = str2.toCharArray();

        Arrays.sort(str1char) ;
        Arrays.sort(str2char) ;

        boolean result = Arrays.equals(str1char, str2char) ;

        if(result) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }
        
       }
        
    }


}