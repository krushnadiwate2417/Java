import java.util.*;

public class CollectionsAPI {
    public static void main(String[] args){

        //ArrayList

        // List<Integer> nums = new ArrayList<>();
        // nums.add(24);
        // nums.add(54);
        // nums.add(21);
        // nums.add(67);

        // System.out.println("Value at Index 1 : "+nums.get(1));

        // nums.add(2,10);

        // System.out.println("Array Size : "+ nums.size());
        // System.out.println(nums);


// =====================================================================================

        // //HashSet

        // //In hashset each value is hashed, based on has value each element is placed in bucket, then when we print the set it actualy traverses the bucket and prints in that order, and not in the order as they were inserted.
        // Set<Integer> nums1 = new HashSet<Integer>();
        // nums1.add(33);
        // nums1.add(24);
        // nums1.add(31);
        // nums1.add(98);


        // //Collection actually implements Iterator Interface. which has these two methods.


        // Iterator<Integer> valuesOfNum1 = nums1.iterator();
        // while(valuesOfNum1.hasNext()){
        //     System.out.println(valuesOfNum1.next());
        // }

        // System.out.println(nums1); 

        // //To get in Inserted Order we can use LinkedHashSet.
        // // To get it in Sorted order we can use TreeSet.


//=============================================================================================

        //Map.

        //Map is actually a collection of keys and values.
        //Keys Cannot be repeated. Like a Set
        //Values can be repeated. Like a List


        //Storing is similar to set, values are hashed, then stored in bucket, then traversed in bucket order.


        //HashTable : it is same as hashmap but it is synchronized, i.e multiple threads can work on it without colision.

        Map<String,Integer> students = new HashMap<>();
        students.put("Krushna",96);
        students.put("Jagruti",98);
        students.put("Amruta",95);
        students.put("Shreya",97);
        students.put("Krushna", 99); //Even though am adding Krushna again, it'll just modify the value of previous key "Krushna" and will not create a duplicate key.

        System.out.println("Krushna Marks now are : "+students.get("Krushna"));
        System.out.println(students);

        //as hashmap is key,value pair, Iterating it is quite different.

        for(String name : students.keySet()){ //.keySet() gives a list of all keys.
            System.out.println("Makrs Of "+name+" : "+students.get(name));
        }


    }
}
