/*
    1. Single Inheritance
            A
            |
            |
            B            B inherits from A

    2. Multilevel Inheritance
            A
            |
            |
            B          B inherits from A
            |
            |
            C          C inherits from B
    
    3. Hierarchical Inheritance
            A
            |
        ---- ----
        |       |
        B       C     B and C inherits from same parent class A

    4. Multiple Inhertance (using Interface)
            A          B
            |          |
            |          |
            ------------
                  |
                  C    C inherits from both interfaces A and B.
 */




class Animal
{
    public String eats()
    {
        return "Animal is Eating";
    }
}

class Dog extends Animal //Single inheritance - as class Dog is extending only from class Animal.
{
    public void display(){
        System.out.println("Dog - " + eats()); 
    }

    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog // Multilevel Inheritance - as Puppy is extending Dog and Dog is extedning Animal class.
{
    public void show(){
        System.out.println("Puppy - " + eats()); // eats() is method of Animal class - so it is using it via Dog class as Dog class extends Animal class.
    }

    public void sound(){
        System.out.println("Puppy weeps");
    }
}

class Cat extends Animal // Hierarchical Inheritance - Cat class and Dog class are extending from same Animal class.
{
    public void display()
    {
        System.out.println("Cat - " + eats());
    }

    public void sound()
    {
        System.out.println("Cat meows");
    }
}


//Java doesn't allow class level multiple inheritance due to diamond problem, so it used interface instead
//Interface - It's Similar to Abstract class ; it has abstract methods (i.e No body) and must be implemented by class that implements Interface 
             // Remeber : It's Similar and not same as abstract class.


interface Fly
{
    void flying();
}

interface Swim
{
    void swimming();
}

class Duck implements Fly,Swim
{
    public void flying(){
        System.out.println("Duck can Fly");
    }

    public void swimming(){
        System.out.println("Duck can also Swim");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.display();
        d.sound();

        Puppy p = new Puppy();
        p.show();
        p.sound();

        Cat c = new Cat();
        c.display();
        c.sound();

        Duck du = new Duck();
        du.flying();
        du.swimming();

    }
}