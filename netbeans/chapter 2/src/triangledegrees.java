import java.util.Scanner;
public class triangledegrees 
{
    public static void main(String[] args) 
    {
         Scanner s = new Scanner (System.in);
         System.out.println("enter the measure of angle 1");
         double a1 = s.nextDouble();
         System.out.println("enter the measure of angle 2");
         double a2 = s.nextDouble();
         double triangle = 180;
         double a3 = 180 - (a2 + a1);
         System.out.println(a3);
                 
         
    }
}
