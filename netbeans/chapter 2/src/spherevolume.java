import java.util.Scanner;
public class spherevolume {
    public static void main(String[] args) {
             Scanner s = new Scanner (System.in);
             
             System.out.println("enter thre radius");
             double radius = s.nextDouble();
             
             double spherevol = (1.33333333) *(3.14159)*Math.pow(radius, 3);
           
             System.out.println(spherevol);
             
         
    }
}
