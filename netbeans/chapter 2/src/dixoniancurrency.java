import java.util.Scanner;
public class dixoniancurrency {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
        System.out.println("enter a dollar amount");
        double amount = s.nextDouble();
        int remainingAmount = (int)(amount * 100);
        
         int $17dollar = remainingAmount / 1700;
        remainingAmount = remainingAmount % 1700;
        
        int $7dollar = remainingAmount / 700;
        remainingAmount = remainingAmount % 700;
        
         int $3dollar = remainingAmount / 300;
         remainingAmount = remainingAmount % 300;
         
         int $44cent = remainingAmount / 44;
  
            remainingAmount = remainingAmount % 44;
            
            int $15cent = remainingAmount / 15;
              remainingAmount = remainingAmount % 15;
              
              int $4cent = remainingAmount / 4;
              remainingAmount = remainingAmount % 4;
              
               int $1cent = remainingAmount / 1;
              remainingAmount = remainingAmount % 1;
              
              System.out.println($17dollar + "" + $7dollar + "" + $3dollar + "" + $44cent + "" + $15cent + "" + $4cent + "" + $1cent  );
    }
}
