
class A
{
    public void show1(){
       System.out.println("in A Show"); 
    }

    public void show1inA(){
       System.out.println("in A Show twice to check"); 
    }

    static class InnerStaticClass{
        public void inInnerStaticClass(){
       System.out.println("in inner static class"); 
    }}

    class InnerNonStaticClass{
        public void inInnerNonStaticClass(){
       System.out.println("in inner non static class"); 
        }
    }

}

class B extends A
{
    public void show2(){
       System.out.println("in B Show"); 
    }
}

//Abstract class - A class which only have methods declared and not implemented can be called as abstract class.
// An obj of Abstract class cannot be directly created.
// An abstract can have only abstract methods, or only non-abstract methods , or both.

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void music(){
        System.out.println("Playing Music ... ");
    }
}

// Here BMW is concrete class, the class which will extend an abstract class must implement all the abstract methods of its parent class, if not then mark this class also as abstract.
class BMW extends Car
{
    public void drive(){
        System.out.println("Driving");
    }
    public void fly(){
        System.out.println("flyinggg");
    }
    public void hp(){
        System.out.println("2300 hp");
    }
}

public class Main {
    public static void main(String[] args) {
        

        A obj = new B();  //Upcasting : Type/Reference of parent class and obj of child class.
        obj.show1(); //We can only access show1 bcoz show1 is of class A and show2 is of class B and Reference of type A can only access members declared in class A, not any subclass methods unless downcast

        B obj1 = (B) obj; //Downcasting : We explicitly changed the Type/Reference of obj from A to B.
        obj1.show2();
        obj1.show1(); //Hence, We can access both show1 and show2 now.

        //Wrapper classes.

        int num = 7;
        String str = "12";
        Integer num1 = num; //Auto-boxing
        Double num2 =(double) num1; //type casting
        int num3 = Integer.parseInt(str); //String parsing
        System.out.println(num1+" "+num2+" "+num3);

        BMW carObj = new BMW(); //we created obj of concrete class.
        carObj.drive();
        carObj.fly();
        carObj.music();
        carObj.hp();

        A innerClass = new A();
        innerClass.show1(); //we can access methods directly of a class(Outer class).


        //This is how we access inner class which is non static
        // FIrst we need object of outer class then we can access inner class via outer class.
        A.InnerNonStaticClass innerNonStaticClass = innerClass.new InnerNonStaticClass();
        innerNonStaticClass.inInnerNonStaticClass();


        //This is how we access inner class which is static.
        // THere is no need of outer class object.
        A.InnerStaticClass innerStaticClass = new A.InnerStaticClass();
        innerStaticClass.inInnerStaticClass();



        //Anonyomous inner class.

        A objA = new A()
        { //This is a anonyomous inner class which gives new defination for obj A methods if we want. or define new methods without need of extending to another class.
            public void show1(){
            System.out.println("in Anynomous Inner Show"); 
            }
        };
        objA.show1(); //objA is a reference of type A, but the object is of an anonyomous subclass that extends A.
        objA.show1inA();


        // We can use anonyomous inner class to implement abstract methods directly.

        Car anyCarObj = new Car() //As we know, we cannot create object of abstract class.
        {
            public void drive(){
                System.out.println("In anonyomous inner class to implement abstrct method drive of abstract class Car");
            }
            public void fly(){
                System.out.println("In anonyomous inner class to implement abstrct method fly of abstract class Car");
            }
        }; 
        anyCarObj.drive(); //Now this anyCarObj isn't object of class Car. it is just the object of anonyomous innner class which extends Car class.
        anyCarObj.fly();

    }
}
