
public class test
{
    public static void main(String[] args) 
    {
       int digits = 2989;
       int page = 1;
        
        while (digits >0 && digits < 10) 
        
        page++;
        
        if(digits> 9 && digits <181)
           
        page = page + 90;
        
        if(digits > 180 && digits < 2701)
        
        page = 999;
                
        System.out.println(page);
        
        
        
        
        
        
    }
}
