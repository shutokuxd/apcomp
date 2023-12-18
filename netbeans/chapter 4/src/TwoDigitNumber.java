
public class TwoDigitNumber 
{
    public static void main(String[] args) 
    {
        
        for(int i = 10; i <100; i++)  
        {
            int x = i% 10;
            int y = i/10;
            if((x + y) * 9 == i)System.out.println(i);
        }
    }
    
}
