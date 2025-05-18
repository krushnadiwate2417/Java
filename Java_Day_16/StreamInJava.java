

//Stream - It is an Interface, which has many methods to work with (map,filter,reduce,sorted).

import java.util.*;
import java.util.stream.Stream;

sealed class Animal permits Cat,Dog{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

non-sealed class Cat extends Animal{
        public void sound(){
        System.out.println("Cat Meows");
    }
}

final class Dog extends Animal{
        public void sound(){
        System.out.println("Dog Barks");
    }
}


record Student(int id, String name){}

public class StreamInJava {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,9,2,6,7);

        nums.forEach(n->System.out.println(n)); //forEach method takes object of Consumer Interface.

        //We can only use Stream once (i.e we cannot reuse it)

        int result = nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,a)->c+a);

        Stream<Integer> mapping = nums.stream().map(n->n%2);
        mapping.forEach(n->System.out.println(n));
        System.out.println(result);

        //2 . var keyword : it can be used, but you'll need to initialize it.

        var x = 10;
        System.out.println("Printing Var value : " +x);

        // 3. Sealed classes


        // 4. Record classes

        Student s1 = new Student(1, "ABC");
        Student s2 = new Student(2, "EFG");

        System.out.println(s1.id() + " " + s1.name());

        System.out.println(s1+"  "+s2);


    }
}
