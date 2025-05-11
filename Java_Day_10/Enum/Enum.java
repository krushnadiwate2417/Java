
enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
//enum is class (only we cannot extend it ) rest functionality is same as class.
enum Laptop 
{
    //Here we declared the named constants(objects) in class(enum) Laptop itself
    //So we can use them as a constructor by passing price as parameter
    Macbook(2000),Thinkpad(1700),Dell(1800),Acer(1900),Asus;

    private int price;

    //As we have declared the objects in class itself, we can make the constructors private.

    private Laptop(){ // Also we implemented default constructor 
        price = 1000;
    }
    private Laptop(int price){ //So we implemented parameterizd constructor 
        this.price = price;
    }



    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

public class Enum {
    
    public static void main(String[] args) {
        
        Days day = Days.MONDAY; //day will have named constant value 'MONDAY'.
        System.out.println(day);

        Days[] d = Days.values(); //Returns all the named constants which can be stored in array.
        for(Days d1 : d) //Enhanced for loop. 
        {
            System.out.println(d1 + " : "+ d1.ordinal()); //d1.ordinal actually prints the code value allocated to each named constant which starts from 0
        }

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }

        Laptop asus = Laptop.Asus;
        asus.setPrice(1230);
        System.out.println(asus.getPrice());
    }
}
