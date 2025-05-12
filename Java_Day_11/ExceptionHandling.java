


//Custom Exception (create your own exception)
class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}


class ThrowsKeyword{ //throws keyoword doesn't handles the exception instead throws it to the thod which calls it.
    public void show() throws ClassNotFoundException{
        Class.forName("ABCD");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        ThrowsKeyword obj = new ThrowsKeyword(); //we need to handle checked exception of which throws keyword sent..
        try{
            obj.show();
        }catch(ClassNotFoundException e){
            System.out.println("No such class exists : "+e);
        }

        try{
            j = 18/i;
            if(j == 0)
                throw new myException("Number must be less than j"); //throw keyword throws the Exceptions
        }catch(myException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero or / " +e);
        }catch(Exception e){
            System.out.println("Something went Wrong : "+e);
        }

        System.out.println("After Exceptiion handled");
    }    
}
