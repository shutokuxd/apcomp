import java.util.Scanner;
public class SilverMedal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

       
        System.out.println("enter absences");
        int absences = s.nextInt();
        System.out.println("enter percentage grade");
        double Sgrade = s.nextDouble();
        System.out.println("enter exam score");
        double exam = s.nextDouble();
        double fg = (Sgrade * 4 + exam) / 5;
       
//       1 a-c
        if(absences <10       )
        if(absences <10 && fg<59.5 && exam>77)System.out.println("EA\n1b");
        if(absences <10 && fg<59.5 && exam<77)System.out.println("E\n1c");

//       2 a-d
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 92.5)System.out.println("A\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 82.5 && fg <= 86.5)System.out.println("B\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 72.5 && fg <= 76.5)System.out.println("C\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 62.5 && fg <= 66.5)System.out.println("D\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg < 89.5 && fg >= 86.5)System.out.println("B+\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg < 79.5 && fg >= 76.5)System.out.println("C+\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg < 69.5 && fg >= 66.5)System.out.println("D+\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 89.5 && fg <= 92.5)System.out.println("A-\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 79.5 && fg <= 82.5)System.out.println("B-\n2a");
        if(absences > 10 && Sgrade >59.5 && exam > 77 && fg > 69.5 && fg <= 72.5)System.out.println("C-\n2a");
        























    }
    
}