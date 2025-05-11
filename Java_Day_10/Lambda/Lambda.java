

@FunctionalInterface //class level annotation for Functional Interface(SAM)
interface A
{
    void show();
}

@FunctionalInterface
interface B 
{
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        

        //This is how we define lambda expression.

        A obj = ()->System.out.println("In A show"); 
        obj.show();


        //Lambda Expression with return and parameters.

        B obj1 = (a,b)->a+b; // if we don't write a return kwyowrd and only have one line to return then we don't need curly braces
        B obj2 = (int a, int b)->{return a+b;}; //If we write a return keyword then we have to use curly braces.
        int result = obj1.add(2, 3);
        int result2 = obj2.add(15, 10);
        System.out.println(result);
        System.out.println(result2);
    }
}
