import java.util.*; 
class FirstThread extends Thread { 
    public void run()
    { Random obj=new Random(); 
        while(true) {
             int rand=obj.nextInt(20); 
             System.out.println("Random number generated is: "+rand); 
             try { 
                Thread.sleep(1000);
                } 
                catch(InterruptedException ex) {
                     System.out.println("Error occured in sleep.."); 
                    } SecondThread secthread=new SecondThread(rand); 
                    secthread.start();
                    ThirdThread thirthread=new ThirdThread(rand); 
                    thirthread.start(); 
                     }
                     }
                     }
                      class SecondThread extends Thread { 
                        private int num;
                         public SecondThread(int n) { num=n; } 
                         public void run() { 
                            int square=num*num; 
                            System.out.println("The square of the number "+num+" is: "+square); 
                        } }
                         class ThirdThread extends Thread { 
                            private int num; 
                            public ThirdThread(int n) { num=n; }
                             public void run() { 
                                int cube=num*num*num; 
                                System.out.println("The cube of the number "+num+" is: "+cube); 
                            }
}public class ThreadDemo
{
public static void main(String[] args)
{
FirstThread fthread=new FirstThread();
fthread.start();
}
}