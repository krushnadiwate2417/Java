import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {
    public static void main(String[] args) throws IOException, NumberFormatException {
        
        //Finally keyword . 
        //finally keyword is used to create a finally block, which is excecuted regardless of exception occurs or not.
        //In real time projects it is used for closing the resources and is often used with try block.
        
        //Simple example.
        int i = 2;
        int j = 0;
        try{
            j = 18/i;
            System.out.println("Value of J as Exception Did'nt occured : "+j);
        }catch(Exception e){
            System.out.println("SOmthing Went Wrong . ");
        }finally{
            System.out.println("Even then Finally for executed");
        }

        //In real time we use finally to close the resource, database connection etc and it is used with try block only .

        BufferedReader bf = null;
        try{
            System.out.println("Enter Number :");
            bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            System.out.println("Number Entered : "+num);
        }finally{
            bf.close();
        }

        //There is one more way which we can implement above logic without using finally block.
        //Note : Only if resoruce we are using is AutoCLosable .


        //Here try block automatically executes bf.close() and closes the resource.

        // try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("Enter Number ");
        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println("Numbeer : "+num);
        // }

        //But finally block is preffered.
    }
}
