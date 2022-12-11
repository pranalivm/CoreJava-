import java.util.ArrayList.* ;
import java.lang.reflect.Array;
import java.util.* ;

public class ArrayListss {

    public static void swap(ArrayList<Integer> list, int idx1,int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

    }

    public static int storeWater(ArrayList <Integer> height) {

        int maxWater=0;

        for(int i=0;i<height.size();i++) {
            for(int j=0;j<height.size();j++) {

                int ht= Math.min(height.get(i), height.get(j));

                int Width = j-i ;
                int currWater = ht* Width ;

                maxWater = Math.max(maxWater, currWater) ;
            }
        }
        System.out.println(maxWater);
        return maxWater ;
        
    }

    public static void storeWaterOpt(ArrayList<Integer> height) {

        int maxWater = 0 ;
        int lp=0;
        int rp =height.size()-1 ;

        while(lp<rp) {
            int ht = Math.min(height.get(lp), height.get(rp)) ;

            int width = rp - lp ;

            int currWater = ht* width ;

            maxWater = Math.max(maxWater, currWater) ;

            if(height.get(lp) < height.get(rp)) {
                lp++ ;
            }
            else {
                rp-- ; 
            }
        }
        System.out.println(maxWater);
    }

    public static boolean pairSum1(ArrayList <Integer> list, int target) {
        for(int i=0;i<list.size();i++) {
            for(int j=i+1; j<list.size();j++) {

            if(list.get(i) + list.get(j) == target) {
                return true ;
            }
        }
    }
        return false ;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()- 1 ; 

        while(lp != rp ) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

             if(list.get(lp) < list.get(rp)) {
                lp++ ;
            }

            else  {
                rp-- ;
            }
          

        }
        return false;

    }
    

    public static boolean paiSumQ(ArrayList<Integer> list,int n,  int target) {
        int bp =-1 ;

        for(int i=0; i<list.size();i++) {
            if(list.get(i) > list.get(i+1)) {
                bp =i ;
                break ;
            }
        }

        int lp =bp+1 ;
        int rp= bp ;

        while(lp != rp) {
            if( list.get(lp)   + list.get(rp) == target) {
                return true ;
            }

             if(list.get(lp)   + list.get <(rp)) {
                lp = (lp+1) % n ;
             }
             else {
                rp = (rp+1) % n ;
             }
        }
        return false ;


    }


    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(9);


        
// storeWaterOpt(height);

       boolean result =  paiSumQ(list,5, 16);
       System.out.println(result);
        




















        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>() ;

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(4);
        // list1.add(1);
        // list1.add(5);

        // mainlist.add(list1) ;
    


        // ArrayList<Integer> list2 = new ArrayList<>();

        // list2.add(8);
        // list2.add(8);
        // list2.add(7);
        // mainlist.add(list2) ;
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(2);
        // list3.add(5);
        // list3.add(7);
        // mainlist.add(list3) ;

        // for(int i=0; i<mainlist.size() ; i++) {
        //     ArrayList<Integer> currList = mainlist.get(i);

        //     for(int j=0;j<currList.size();j++) {

        //         System.out.print(currList.get(j)+"");

        //     }
        //     System.out.println();



        // }
        

      






























        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // ArrayListss<String> cars = new ArrayListss<String>();


    //     list.add(2) ;
    //     list.add(5) ;
    //     list.add(3) ;
    //     list.add(4) ;

    // System.out.println("swap");

    //     swap(list, 0, 1);
    //     System.out.println(list);

        
    //     Collections.sort(list);
    //     System.out.println(list);

    //     Collections.sort(list,Collections.reverseOrder());
    //     System.out.println(list);





        // System.out.println(list);

        // int element = list.get(1);
        // System.out.println(element);

        // list.remove(2);
        // System.out.println(list);

        // list.set(2,10);
        // System.out.println(list);

        // System.out.println(list.contains(1));

        // list.add(0,9);
        // System.out.println(list);

        // System.out.println(list.size());

        // System.out.println("list");
        // for(int i=0;i<list.size();i++) {
        //     System.out.println(list.get(i));
        // }
        // System.out.println();

        // //reverse

        // System.out.println("reverse");
        // for(int i=list.size()-1;i>=0;i--) {
        //     System.out.println(list.get(i));
        // }
        // System.out.println();

        // System.out.println("Max");

        // int max= Integer.MIN_VALUE;

        // for(int i=0;i<list.size();i++) {
        //     if(max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        // // max = Math.max(max,list.get(i)) ;

        // System.out.println("Swap");

        






        
    }
    
}
