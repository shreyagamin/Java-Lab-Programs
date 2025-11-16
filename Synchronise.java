class Callme{
    synchronized static void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Interupted");
        }
        System.out.println("]");
    }
}
class Caller extends Thread{
    String msg;
    public Caller(String s){
        msg=s;
    }
    public void run(){
        Callme.call(msg);
    }
}
public class Synchronise {
    public static void main(String[] args){
        Caller ob1=new Caller("Learn");
        Caller ob2=new Caller("Java");
        Caller ob3=new Caller("Programming");
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
