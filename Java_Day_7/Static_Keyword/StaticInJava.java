//NOTE : Top level classes must always be public or no-modifier or(abstract, final)
// We cannot create private, protected, static, as top level classes
// Only nested (inner) classes can be private, protected, static


class Mobile
{
    String brand;
    int price; //Instance variable
    static String type; //static variable - belong to class and not to object, all objects share same static variable, changing static varirable will affect all objects

    static //Static block is called only once when Class is Loaded in Class Loader in JVM.
    {
        type = "Phone";
        System.out.println("In static block");
    }

    Mobile() //Everytime we create an instance of class(i.e object) contructor is called.
    {
        brand = "Default";
        price = 100;
        System.out.println("In Constructor block");

    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void staticMethod() //Static Method
    //we cannot DIRECTLY use non-static variables inside static methods (i.e we cannot use "brand" and "price" variable inside static method.) but we can use static variables inside static methods (i.e. type)
    {
        System.out.println("Static method also belongs to class, and can be directly accessed via class. No need to create an object of the class : " + type);
    }

    static class Manufactuer // static subclass
    {
        String country;

        void inStaticClass()
        {
            System.out.println("In static class " + country);
        }
    }
}

public class StaticInJava
{
    public static void main(String[] args) throws ClassNotFoundException
    {   
        //There is a way to Load a class in class loader without creating the class object.

        //Class.forName("Mobile"); //********** */
        
        // Class class gives us a method .forName(String "name of class") which loads the class without creating object.
        // It is mostly used while working with JDBC.

        Mobile.type = "Smartphone"; //Static variables are accessed directly by class, no need to create an object.

        Mobile obj1 = new Mobile(); //Whenever we first object is created class is loaded for that once only and not everytime a new obj is created.
        obj1.brand = "Apple";
        obj1.price = 1200;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;

        Mobile obj3 = new Mobile();

        obj1.show();
        obj2.show();
        obj3.show();

        Mobile.staticMethod(); // accesseing static method via class itself as it belongs to class only.

        Mobile.Manufactuer stat1 = new Mobile.Manufactuer(); // here we were directly able to access the Manufactuer class without creating a obj for mobile class first, as Manufactuer class is static.
        stat1.country = "India";
        stat1.inStaticClass();
    }
}

