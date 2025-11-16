
import java.util.*;
public class TimeConv{
    void converter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in hours:");
        double h=sc.nextDouble();
        double m=h*60;
        double s=h*3600;
        System.out.println("Time in hours: "+h);
        System.out.println("Time in minutes: "+m);
        System.out.println("Time in seconds: "+s);
        System.out.println("enter Time in minutes: ");
         m=sc.nextDouble();
         h=m/60;
         s=m*60;
            System.out.println("Time in hours: "+h);
            System.out.println("Time in seconds: "+s);
    }
}
