class Person
{
    String name; // String is an Class Data Type from java.lang package
    // i.e it is passed by reference, copy of reference is passed 
}


public class Calling
{

    public static void changeNumber(int a)
    {
        a = 1020;
    }

    public static void changeName(Person p)
    {
        p.name = "Krushna";
    }

    public static void main(String[] args)
    {
        int num1 = 10;

        Person p1 = new Person();
        p1.name = "Jag";
        System.out.println(p1.name);
        System.out.println(num1);
        changeNumber(num1); // Even though we are changing the number in changeNumber method, the num1 we are passing is the copy of value so original value does't get affected.
                            // i.e we are using primitive data type so it does'nt change original value
        changeName(p1);  // As a object is passed as argument, objects are passed as a copy of reference
                            // i.e changes affect the original object as well.
        System.out.println(num1);
        System.out.println(p1.name);
    }
}