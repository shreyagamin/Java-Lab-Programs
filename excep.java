import java.util.*;

class GException {
    int[] arr = new int[5];

    void readelements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int getSmall() {
        int small = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Smallest element: " + small);

        for (int i = 0; i < 5; i++) {
            int result = arr[i] / small;
            System.out.println("Element " + arr[i] + " / " + small + " = " + result);
        }

        return small;
    }

    void display() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter index to access array element (0–4):");
        int index = read.nextInt();

        int value = arr[index]; 
        System.out.println("Element at index " + index + " is " + value);
    }

    void num() {
        String s = "abc";
        System.out.println("Converting string to integer:");
        System.out.println(Integer.parseInt(s)); 
    }

    void compute() {
        readelements();
        getSmall();
        display();
        num();
    }
}

public class excep {
    public static void main(String[] args) {
        GException ge = new GException();

        try {
            ge.compute();
            ge.num();
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}

