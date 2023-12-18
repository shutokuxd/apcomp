import java.util.Scanner;
public class factors 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in); 
        System.out.println("enter x1");
       int x1 = s.nextInt();
        System.out.println("enter x2");
       int x2 = s.nextInt();
       
       for(int i = 1; i <= x2; i++)
       
       {
           if(x1% i == 0 && x2 % i == 0) System.out.println(i);
       }
    }
    
}
