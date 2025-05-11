
//Interface-it is just a design/structure(abstract concept) which can be implemented by other classes.
//Interface is used to achieve Abstraction and Multiple inheritance & enable polymorphism.

//Here we created an Interface which gives a desgin of Computer and then Desktop and Laptop implements the Computer code method.

interface Computer{

    String variableInInterface = "Variables in Interface are by default static and final. i.e. you cannot change its value, and you can access it without creating object";
    public void code(); //All methods in interface are abstract by default.
}

class Desktop implements Computer
{
    public void code(){
        System.out.println("Krushna was assigned a Desktop which has Computer in it.");
    }
}

class Laptop implements Computer
{
    public void code(){
        System.out.println("Krushna was assigned a Laptop which has Computer in it.");
    }
}
//So a developer can now get both laptop and desktop as both has computer in it.
class Developer
{
    public void makeApp(Computer comp){
        comp.code();
    }
}


public class InterfaceInJava {
    public static void main(String[] args) {

        System.out.println(Computer.variableInInterface);

        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer krushna = new Developer();
        krushna.makeApp(desk);
        krushna.makeApp(lap);
    }
}
