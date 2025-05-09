//Polymorphism allows one interface (method or object reference) to represent different underlying forms (objects or method implementations).

// Compile time polymorphism (early binding) (method overloading) (No inheritance required)
// Run time polymorphism (late binding) (method overriding) (Inheritance required)


/*
   Final Keyword-
   1. used to declare constants.
   2. can be used for variables, methods, class
   3. final class cannot be inherited.
   4. final method cannot be overriden.
   5. final variable cannot be changed.
 */

class A
{
    public void show(){
        System.out.println(" in A show ");
    }
}

class B extends A
{
    public void show(){
        System.out.println(" in B show ");
    }
}

class C extends A
{
    public void show(){
        System.out.println(" in C show ");
    }
}

public class Polymorphism
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
    }
}