import animals.Dog;

class Protect 
{
    protected String type = "Protecting";
}

public class Demo extends Dog
{
    public static void main(String args[])
    {
        Demo d = new Demo();
        System.out.println(d.name);

        Protect p = new Protect();
        System.out.println(p.type);
    }
}