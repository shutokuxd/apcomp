
import java.util.Scanner;


public class ifIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
//        
//        System.out.println("enter your age");
//        int age = s.nextInt();
////        under 18 = minor 18 - 64 =adult, 65+ = senior citizen
//        if(age < 18)
//        { System.out.println("you are a minor");
//           
//        }
//        if (age >=65) System.out.println("you are a senior citizen");
//     
//        if (age >=18 && age <65);
            
        int num = s.nextInt();
        int den = s.nextInt();
        
        if(den== 0) System.out.println("can't divide by zero.");
        else System.out.println("num/den");
            }
}
