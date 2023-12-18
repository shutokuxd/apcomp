
import java.util.Scanner;


public class EX3_19 {
    public static void main(String [] args) 
    {
        Scanner s = new Scanner(System.in);
        
      // double x1 = s.nextDouble();
		double side1 = s.nextDouble();
		double side2 = s.nextDouble();
		double side3 = s.nextDouble();
		
		
		
//double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
//double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
//double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
double perimeter = side1 + side2 + side3;
     
     
    if(side1 + side2 <= side3)System.out.println("invalid.");
    else if(side1 + side3 <= side2)System.out.println("invalid.");
    else if(side2 + side3 <= side1) System.out.println("invalid.");
    else System.out.println(perimeter);
        
    }
}
