import java.util.Scanner;
public class chapter3Review {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter present value");
        int pv = s.nextInt();
        System.out.println("enter the anual intrest rate");
        double r = s.nextDouble()/100.0;
        System.out.println("enter number of year before future value is calculated");
        int t = s.nextInt();
        System.out.println("enter number of times per year that intrest is calculated");
        int m = s.nextInt();
        boolean ruleBroken = false;  //false means no rules broken
        if(pv < 1000 || pv > 6000)
        {
            System.out.println("Rule 1 was broken");
            ruleBroken = true;
        }
        if(t < 5 || t > 30)System.out.println("Rule 2 was broken");
        if(m != 12 && m != 26 && m != 52)System.out.println("Rule 3 was broken");
        
        if(ruleBroken == false)
        {
               double fv = pv* Math.pow(1+(r/m), m*t);
               int fv2 = (int)(fv +.5);
                
             if(fv2>pv)System.out.println("You gained $" + fv2);
             if(fv2<pv)System.out.println("You lost $" + fv2);
             if(fv2 > 100000000)System.out.println("You are a millionare");
             
        }
     
       
       
            
    
        
        
            
        
    }
}
