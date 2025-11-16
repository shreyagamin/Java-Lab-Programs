import java.util.*;
class MyArray{
    int a[],n,even,odd;
    void reading(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements=");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("engter the array elements :");
        for(int i=0;i<n;i++){
a[i]=sc.nextInt();
        }
    }
    void compute(){
        odd=0;
        even=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
    }
    int NoEven(){
        return even;
    }
    int oddNO(){
        return odd;
    }

}
public class ArraySymmetric{
    public static void main(String[] args){
        MyArray m1=new MyArray();
MyArray m2=new MyArray();
System.out.println("enter the details of 1st array -");
m1.reading();
m1.compute();
m2.reading();
m2.compute();
if(m1.NoEven()==m2.NoEven() && m1.oddNO()==m1.oddNO()){
System.out.println("Arrays are symmetric ");
}
else{
    System.out.println("Arrays are not symmetric");
}
    }
}