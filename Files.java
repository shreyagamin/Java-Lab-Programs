import java.util.*;
import java.io.*;
public class Files {
   public static void main(String[] args) throws Exception{
    System.out.println("Enter the file name =");
    Scanner sc=new Scanner(System.in);
    String f=sc.next();
    File file=new File(f);
    Scanner fread=new Scanner(file);
    int lcount=0,wcount=0,ccount=0;
    while(fread.hasNextLine()){
        String line=fread.nextLine();
        lcount++;
        ccount=ccount+line.length();
        String words[] = line.trim().split("\\s+");
        wcount=wcount+words.length;
    }
    System.out.println("Number of lines ="+lcount);
    System.out.println("Number of words ="+wcount); 
    System.out.println("Number of characters ="+ccount);
   } 
}
