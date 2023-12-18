import java.util.Scanner;
public class TenIfs {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();
        //1 - Number is Odd
        if(num % 2 == 1) System.out.println("true");
        else { System.out.println("false");}
        //2 - Divisible by 7
        if(num % 7 == 0)System.out.println("true");
        else {System.out.println("false");}
        //3 - Greater than 50
        if(num > 50)System.out.println("true");
        else {System.out.println("false");}
        //4 - Less than 10
        if(num < 10)System.out.println("true");
        else System.out.println("false");
        //5 - Number is 17
        if(num == 17)System.out.println("true");
        else { System.out.println("false"); }
        //6 - Has 2 digits
        if(num >= 10 && num !=100)System.out.println("true");
        else {System.out.println("false");}
        //7 - Has the digit 2 in it
        if(num/10 ==2||num%10 ==2)System.out.println("true");
        else {System.out.println("false");}
        //8 - Number is in range of 90 to 100, or under 60
        if(num <60 && num >= 90 && num <= 100  )System.out.println("true");
        else {System.out.println("false");}
        //9 - Has 2 digits and both digits are same
        if(num % 11 ==0 ) System.out.println("true");
        else {System.out.println("false");}
       
        //10 - The number has an even digit
        if(num % 2 ==0 || (num/10) % 2 ==0) System.out.println("true");
        else {System.out.println("false");}
                

    }
    
}
