import java.util.Scanner;
public class daysinamonth {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter month");
        int month = s.nextInt();
        System.out.println("enter year");
        int year = s.nextInt();
        
        if (month == 1) System.out.println("Janurary " + year + " had 31 days");
        { if(month == 2 & year %4 == 0)System.out.println("Feburary " + year + " had 28 days");
        else System.out.println("Feburary " + year + " had 29 days");
                }
        if(month == 3)System.out.println("March " + year + " had 31 days");
        if(month == 4)System.out.println("April " + year + " had 30 days");
        if(month == 5)System.out.println("May " + year + " had 31 days");
    }
}
