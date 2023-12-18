import java.util.Scanner;
public class trianglearea {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter height");
        double height = s.nextDouble();
        System.out.println("Enter base");
        double base = s.nextDouble();
        double area = 0.5 * (base * height);
        System.out.println(area);
    }
}
