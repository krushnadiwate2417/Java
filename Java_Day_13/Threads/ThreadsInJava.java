
//Thread in Java :
// Thread is a smallest unit of processing, it is used to achieve multithreading(multiple programs running parallely).
//It is of java.lang class.
//Thread class implements the Runnable interface.








// class A implements Runnable
// {
//     public void run(){
//         for(int i = 1;i<=5;i++){
//             System.out.println("Hi A");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run(){
//         for(int i = 1;i<=5;i++){
//             System.out.println("Hello B");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

class Counter {
    int count;
    //We care using synchronized keyword so that when two or more threads try to access same resource at same time, it will only allow 1 thrad to access it at 1 time.
    //(i.e Race condition.)
    public synchronized void increment(){
        count++;
    }
}


public class ThreadsInJava  {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Runnable objA =new Runnable() {
            public void run(){ //Run is method of Runnable interface and not Thread class.
                for(int i = 1;i<=2000;i++){
            // System.out.println("Hi A");
            // try {
            //     Thread.sleep(10); //Sleep is used to send thread to waiting state, we can also use wait() but then to send thread to runnable state, we will have to use notify().
            //sleep() is a timed wait and will be sent to runnable state after specified timeout.
            //     } catch (InterruptedException e) {e.printStackTrace();}

                    c.increment();

            }
        }
    };
        Runnable objB =()->{
                for(int i = 1;i<=2000;i++){
            // System.out.println("Hello B");
            // try {
            //     Thread.sleep(10);
            //     } catch (InterruptedException e) {e.printStackTrace();}

                    c.increment();
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start(); //Start is a method of Thread class...
        t2.start();

        //Join is used to tell main that wait until both threads come back and then execute the reamaing code.
        t1.join();
        t2.join();


        System.out.println("Watitng for threads to come back.");
        System.out.println(c.count);

    }
}
