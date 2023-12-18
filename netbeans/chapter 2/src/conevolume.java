import java.util.Scanner;

public class conevolume {
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         
         System.out.println("enter the radius");
         double radius = s.nextDouble();
         System.out.println("enter the height");
         double height = s.nextDouble();
         double cone = (0.333333333)* (3.14159)* Math.pow(radius, 2)* height;
         System.out.println(cone);
    }
   
}
