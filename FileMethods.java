import java.util.Scanner;
import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read file or directory name
        System.out.print("Enter name of file/directory: ");
        String s = input.nextLine();

        File f1 = new File(s);

        // File Information
        System.out.println("File Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Absolute Path: " + f1.getAbsolutePath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println("This file: " + (f1.exists() ? "Exists" : "Does not exist"));
        System.out.println("Is File: " + f1.isFile());
        System.out.println("Is Directory: " + f1.isDirectory());

        // Contents of Directory
        System.out.println("Contents:");
        String[] fileList = f1.list();

        try {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(" " + fileList[i]);
            }
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // Other Properties
        System.out.println("Is Readable: " + f1.canRead());
        System.out.println("Is Writable: " + f1.canWrite());
        System.out.println("Is Absolute: " + f1.isAbsolute());
        System.out.println("File Last Modified: " + f1.lastModified());
        System.out.println("File Size: " + f1.length() + " bytes");
        System.out.println("Is Hidden: " + f1.isHidden());

        // Create a Directory
        System.out.print("Enter name of directory to create: ");
        String dirname = input.nextLine();

        File dir = new File(dirname);

        if (!dir.exists()) 
            dir.mkdir();

        System.out.println(dir + " created.");
    }
}
 