// Print All Multiples of Three (Loop)
// Write a function that prints and returns
// an array of all multiples of 3 less than a given int.


import java.util.List ;
import java.util.ArrayList ;

public class Main {
    public static List<Integer> multOfThree(int n){
        ArrayList<Integer> multiples = new ArrayList<>();
        for( int i = 1 ; i < n ; i++ ){
            if(i % 3 == 0){
                multiples.add(i);
            }
        }
        return multiples ;

    }
    public static void main(String[] args){
        System.out.println(multOfThree(100)) ;
    }

}
