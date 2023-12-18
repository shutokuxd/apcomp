import java.util.Scanner;
public class midpoint {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       
        System.out.println("enter x1");
       double x1 = s.nextDouble();
        System.out.println("enter x2");
        double x2 = s.nextDouble();
        System.out.println("enter y1");
        double y1 = s.nextDouble();
        System.out.println("enter y2");
        double y2 = s.nextDouble();
       
        double x = (x1 + x2)/(2);
        double y = (y1 + y2)/(2);
        System.out.println(x + "," + y);
    }
}
