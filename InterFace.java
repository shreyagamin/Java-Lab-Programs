import java.util.*;
interface Resume{
    public void biodata();
}
class Student implements Resume{
    String personalInfo,result,discipline;
    void readData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the personal info =");
        personalInfo=sc.nextLine();
        System.out.println("enter the result =");
        result=sc.nextLine();
        System.out.println("enter the discipline =");
        discipline=sc.nextLine();
    }
    public void biodata(){
        System.out.println("Personal Info: "+personalInfo);
        System.out.println("Result: "+result);
        System.out.println("Discipline: "+discipline);
    }
}
class Teacher implements Resume{
    String personalinfo,qualificaation,experience,achievements;
    void readData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the personal info =");
        personalinfo=sc.nextLine();
        System.out.println("enter the qualification =");
        qualificaation=sc.nextLine();
        System.out.println("enter the experience =");
        experience=sc.nextLine();
        System.out.println("enter the achievements =");
        achievements=sc.nextLine();
    }
    public void biodata(){
        System.out.println("Personal Info: "+personalinfo);
        System.out.println("Qualification: "+qualificaation);
        System.out.println("Experience: "+experience);
        System.out.println("Achievements: "+achievements);
    }
}
public class InterFace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        Teacher t=new Teacher();
        System.out.println("Enter Student Details:");
        s.readData();
        System.out.println("\nEnter Teacher Details:");
        t.readData();
        System.out.println("\nStudent Biodata:");
        s.biodata();
        System.out.println("\nTeacher Biodata:");
        t.biodata();
    }
}