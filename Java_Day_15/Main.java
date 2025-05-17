import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args){

        Comparator<Integer> com = new Comparator<Integer>() { //It is neccessary to define <Data Type> on both sides for interfaces.

            //Here we mention our own logic for sorting.
            public int compare(Integer i, Integer j){
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(92);
        nums.add(13);
        nums.add(81);

        Collections.sort(nums); //By default it uses comparable which has method compareTo, which follows natural ordering sort (Natural Ordering means as Integers are 1,2,3... so they are sorted in ascending order, for Strings it is lexicographic apple,banana,cherry...)

        System.out.println("Compareable sort(Natural Ordering) : "+nums);

        Collections.sort(nums,com); //Here we explicitly mentioned another sorting logic(i.e Compartaor.)

        System.out.println("Comparator sort(Custom Ordering) : "+nums);
    }
}