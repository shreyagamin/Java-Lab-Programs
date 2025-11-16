import java.util.*;
class Student{
    private String name;
    private String usn;
    private String branch;
    private long phoneNo;
    Student(String name,String usn,String branch,long phoneNo){
        this.name=name;
        this.usn=usn;
        this.branch=branch;
        this.phoneNo=phoneNo;
    }
    static Student reading(){
        Scanner sc=new Scanner(System.in);
        Scanner read=new Scanner(System.in);
        
        System.out.println("Enter the name=");
        String name=sc.nextLine();
        System.out.println("Enter usn");
        String usn=sc.nextLine();
        System.out.println("enter branch=");
        String branch=sc.nextLine();
        Long phoneNo=read.nextLong();
       
       
        return new Student(name,usn,branch,phoneNo);
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("Branch: "+branch);
        System.out.println("Phone Number: "+phoneNo);
    }
}
public class StudentDetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
       int n=sc.nextInt();
       
       Student s[]=new Student[n];
       for(int i=0;i<n;i++){
        System.out.println("Enter details of student "+(i+1)+":");
        s[i]=Student.reading();
        
        
       }
       for(int i=0;i<n;i++){
        System.out.println("Details of student "+(i+1)+":");
        s[i].display();
       }
       
    }
}