import java.util.Scanner;
public class BronzeMedal
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter hour");
        int hour = s.nextInt();
        System.out.println("enter wage");
        double wage = s.nextDouble();
       double reg = 40*wage;
            double o = (hour-40)* (1.5 * wage);
            double overtime = reg + o;
            double dt = (hour-80)* (2 * wage);
        if(hour >40 && hour < 80)
        {
           
            System.out.println("You earned " + "$" + overtime + " this week.");
        }
        if(hour >80) System.out.println ("You earned " + "$" + (dt + overtime) + "0" + " this week.");
        if (hour < 40) System.out.println("You earned " + "$" + wage * hour + "0");
        
    }
}

