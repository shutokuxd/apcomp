import java.util.Scanner;
public class cylindersurfacearea {
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         System.out.println("enter a value for height");
         double h = s.nextDouble();
         System.out.println("enter a value for radius");
         double r = s.nextDouble();
         double sarea = (2*(3.14159)*r*h) + (2*(3.14159)*r*r);
         System.out.println(sarea);
    }
        
}
