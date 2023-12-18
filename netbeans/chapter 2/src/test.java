import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        final double e = 2.71828;
        double start = 300000000;
        double growth = 0.125;
        double time = 9;
        
        double gt =  time*growth;
        double future = start * Math.pow(e, gt);
        System.out.println((int)future + 0.5);
        
        
                
    }
}
