import java.util.Scanner;
public class square 
{
    public static void main(String[] args) 
    {
//        //declare our scanner - dont forget import statement
//        Scanner s = new Scanner(System.in);
////        request input
//        System.out.println("enter side length of square:");
//        //get the input from the output windows using the scanner
//        int sideLength = s.nextInt();
//        //calculate something using the input from user
//        int area = sideLength * sideLength;
//        int perimeter = sideLength * 4;
//        //output the answer
//        System.out.println("area = " + area);
//        System.out.println("perimeter = "  + perimeter);
        
        //2.1
//        Scanner s = new Scanner (System.in);
//        //System.out.println("enter degrees in celsius:");
//        double celsius = s.nextDouble();
//        double farenheit = (9.0/5) * celsius + 32;
//        System.out.println((int) celsius + " Celsius is " + farenheit + " Fahrenheit ");
       
        //2.2
//        Scanner s = new Scanner (System.in);
//        System.out.println("enter the radius of a cylinder");
//        System.out.println("enter the length of a cylinder");
//        double radius = s.nextDouble ();
//        double area = radius * radius * 3.14;
//        double length = s.nextDouble ();
//        double volume = area * length;
//        System.out.println( "The area is " + (int)area);
//        System.out.println("The volume is " + (int) volume);
        
        //2.12
      
        Scanner s = new Scanner (System.in);
        System.out.println("Enter speed");
        double speed = s.nextDouble();
        System.out.println("Enter the acceleration");
        double acceleration = s.nextDouble();
        double length = (speed *speed) /(2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
        
        
        
        
        
    }
    
}

// 2.15

