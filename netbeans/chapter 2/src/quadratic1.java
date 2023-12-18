import java.util.Scanner;
public class quadratic1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
       
        System.out.println("enter a value");
        double a = s.nextDouble();
        System.out.println("enter b value");
        double b = s.nextDouble();
        System.out.println("enter c value");
        double c = s.nextDouble();
       
       
   
       
        double x = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
               
     
        System.out.println(x);
    }
   
}