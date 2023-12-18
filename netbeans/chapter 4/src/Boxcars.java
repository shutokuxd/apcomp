
public class Boxcars {
    public static void main(String[] args) 
    {
        int counter = 0;
        int d1 = 0;
        int d2 = 0;
        while(d1!=6 || d2!=6);
        {
        d1 = (int)(Math.random()*6)+1;
        d2 = (int)(Math.random()*6)+1;
        System.out.println("You rolled " +d1 + " and " +d2);
        counter++;
        }
        System.out.println("It took "+ counter + " rolls to get boxcars.");
       
    }
  
}
