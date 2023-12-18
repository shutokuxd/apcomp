import java.util.Scanner;
public class circlearea 
{
    public static void main(String[] args) {
           Scanner s = new Scanner (System.in);
        System.out.println("enter the radius");
        double radius = s.nextDouble();
              
        double area = 3.14159 * (radius * radius);
        System.out.println(area);
    }
         
}
