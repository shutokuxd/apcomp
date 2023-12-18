
public class brutesample1 
{
    public static void main(String[] args)
    {
      for (int x = 1; x <100; x++)
      {
          for(int y = 1; y <100; y++)
          {
              if(Math.pow(x,y)==Math.pow(y,x)&& x != y)
//                  or  if(Math.pow(x,y)==Math.pow(y,x))
//                  if(x != y)
                  System.out.println(x + ", " + y);
          }
      }
    }
}
