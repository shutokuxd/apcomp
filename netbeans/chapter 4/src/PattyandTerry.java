
public class PattyandTerry 
{
    public static void main(String[] args) 
    {
        for(int patty = 1; patty < 36; patty++)
        {
            for(int terry = 1; terry < 36; terry++)
            {
                if((terry +10)+ (patty+ 10) == 36 && terry*3 == patty) System.out.println(patty + " " + terry);
            }
        }
    }
}
