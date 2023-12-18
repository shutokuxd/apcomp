
public class threedigitnumber 
{
    public static void main(String[] args) 
    {
        for(int i = 100; i<1000; i++)
        {
          int one = i %10;
          int ten = i/10%10;
          int hundred = i/100;
          
          if(ten == one + 5 && hundred == ten - 8) System.out.println(i);
        }
    }
}
