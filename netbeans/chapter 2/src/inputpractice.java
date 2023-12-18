import java.util.Scanner;
public class inputpractice 
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);  
        System.out.println("enter your age:");
        int age = s.nextInt();
        System.out.println(age);
        System.out.println("enter hourly wage:");
        double wage = s.nextDouble();
        System.out.println("$" + wage);
    }
    
}
