
public class Sampleproblem2 
{
    public static void main(String[] args) 
    {
        for(int man = 1; man < 100; man++)
        {
            for(int woman = 1; woman < 100; woman++)
            {
                if(man + woman == 99 && woman + 9 == man)
                
                    if(man/10 == woman % 10 && man %10 == woman/10)
                
                {
                    System.out.println("man is " + man + " and woman is " + woman);
                }
                   
            }
        }
    }
}
