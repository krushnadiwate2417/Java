
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


//Taking user input.
public class UserInput {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter A Numer for BufferedReader: ");

        // 1. 

        //Using InputStream and BufferdInputStream

        //System.in means we are going to accept input from system not from any netwrok or file.
        InputStreamReader in = new InputStreamReader(System.in); //InputStreamReader accepts a object of in o we used 'System.in'
        BufferedReader bf = new BufferedReader(in); //BufferedReader accepts an obj of InputStreamReader class.
        //BufferedReader actually is a resourse and can read from anything (file,netwrok,etc).

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        
        // 2.
        //Using Scanner of util class.
        //Scanner was introduced after java 1.5 .
        
        System.out.println("Enter A Number for Scanner : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        
        //Remeber : Use bf.close() or sc.close() when we are sure that we won't use System.in, bcoz it also closes system.in  
        
        bf.close(); //As we know BUfferedReader is a resource, we must close it after using it or it will be termed as (Resource leak) and nobody else can use it.
    }

}
