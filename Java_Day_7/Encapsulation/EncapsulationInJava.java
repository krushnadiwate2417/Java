//Encapsulation - we hide the internal data and only way to access the data is via methods,(i.e we bind together the data(variables) and methods i.e encapsulate them, we only allow necessary operations without directly exposing our data(variables)).


class Human
{   
    //Private Variables(data) - only accessible in same class
    private int age;
    private String name;

    public Human()
    {
        name = "Default";
        age = 404;
    }

    //Public Getters
    public int getAge() {return age;}
    public String getName() {return name;}

    //Public Setters
    public void setAge(int age){this.age = age;} //this keyword refers to the current object, the object which is calling the method, which is currently accessing the class.
    public void setName(String name){this.name = name;}

}

public class EncapsulationInJava
{
    public static void main(String[] args)
    {
        Human h1 = new Human();
        h1.setAge(22);
        h1.setName("Krushna");

        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}