import java.util.Scanner;
public class test 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter the tempeture");
        int t = s.nextInt();
        System.out.println("enter the wind velocity");
        int v = s.nextInt();
        double wc = 35.74 + (0.6215 * t)- Math.pow(35.75 * v, 0.16)+ Math.pow((0.4275*t*v), 0.16);
        if(t < -58 || t > 41)System.out.println("Invalid temp");
        else if(v<2)System.out.println("Invalid wind");
        else if(t < -58 || t > 41 && v<2 )System.out.println("Invalid temp and wind");
        else System.out.println(wc);
        
        
   }
}
