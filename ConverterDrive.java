
public class ConverterDrive {
    public static void main(String[] args) {
        DistanceConv dc = new DistanceConv();
        TimeConv tc = new TimeConv();
        System.out.println("Distance Conversion:");
        dc.coverter();
        System.out.println("\nTime Conversion:");
        tc.converter();
    }
}
