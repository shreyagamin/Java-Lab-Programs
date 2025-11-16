
import java.util.*;
public class DistanceConv{
    void coverter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double m=sc.nextDouble();
        double km=m*1.609;
        System.out.println("Distance in miles: "+km);
        System.out.println("enter Distance in kilometers: ");
         km=sc.nextDouble();
         m=km/1.609;
         double cm=km*1000;
            System.out.println("Distance in meters: "+cm);
            System.out.println("Distance in miles: "+m);
    }
}
