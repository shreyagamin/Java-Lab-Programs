import java.util.*;
class Main{
    int id,phone,salary;
    String name;
    void read(){
        Scanner sc=new Scanner(System.in);
        Scanner read=new Scanner(System.in);
        System.out.println("enter the id =");
        id=sc.nextInt();
        System.out.println("enter the name =");
        name=read.nextLine();
        System.out.println("enter the phone number =");
        phone=sc.nextInt();
        System.out.println("enter the salary =");
        salary=sc.nextInt();
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phone);
        System.out.println("Salary: "+salary);
    }

}
class Teaching extends Main{
    String domain,p;
    void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the domain =");
        domain=sc.nextLine();
        System.out.println("enter the publication =");
        p=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Domain: "+domain);
        System.out.println("Publication: "+p);
    }
}
class Technical extends Main{
    String skills;
    void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the skills =");
        skills=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Skills: "+skills);
    }
}
class Contract extends Main{
    int period;
    void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the period =");
        period=sc.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Period: "+period);
    }
}
public class Staff{
    public static void main(String[] args){
        Teaching t=new Teaching();
        Technical te=new Technical();
        Contract c=new Contract();
        System.out.println("Enter details of Teaching Employee:");
        t.read();
        System.out.println("Enter details of Technical Employee:");
        te.read();
        System.out.println("Enter details of Contract Employee:");
        c.read();
        System.out.println("\nDetails of Teaching Employee:");
        t.display();
        System.out.println("\nDetails of Technical Employee:");
        te.display();
        System.out.println("\nDetails of Contract Employee:");
        c.display();
    }
}
