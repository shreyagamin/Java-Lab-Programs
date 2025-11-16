import java.util.*;
public class RandomNuberGuess{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int comp=rd.nextInt(10);
        while(true){
            System.out.println("Enter the number : ");
num=sc.nextInt();
if(comp==num){
    System.out.println("ur guess is right ");
}
else if(num>comp){
    System.out.println("higher");
}
else{
    System.out.println("Lower");
}
        }
    }
}