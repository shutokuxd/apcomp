
import java.util.Scanner;
public class Quadratics 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter values for a, b and c");
        //Get a, b, c from user
        double a = convertToDouble(getValue());
        double b = convertToDouble(getValue());
        double c = convertToDouble(getValue());
        double discriminant = calculateDiscriminant(a, b, c);
        outputEquation(a, b, c); //output equation
        //calculate and output answers based on the user input
        if(isPositive(discriminant) || numberOfRoots(discriminant)==2)
        outputTwoRoots(a, b, discriminant);
        else if (isZero(discriminant) || numberOfRoots(discriminant)==1)
        outputOneRoot(a, b, discriminant);
        else if (isNegative(discriminant) || numberOfRoots(discriminant)==0)
        noRoots();
        
        
    }
    public static int getValue()
    {
        return 0;
    }
    public static double convertToDouble(int num)
    {
        return 0;
    }
    public static int NumberOfRoots (int d)
    {
        return 0;
    }
    public static double calculateDiscriminant (double a, double b, double c)
    {
        return 0;
    }
    public static boolean isPositive (double num)
    {
        return true;
    }
    public static boolean isNegative (double num)
}
