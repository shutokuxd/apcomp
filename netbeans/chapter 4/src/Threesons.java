
public class Threesons 
{
    public static void main(String[] args) 
    {
        for(int son1 = 1; son1 < 36; son1++)
        {
          for(int son2 = 1; son2 < son1; son2++)
          {
           for(int son3 = 1; son3 < son2; son3++)
           {
               if(son1 - son2 >= 2 && son1 - son2 <= 8)
               {
                    if(son1 - son3 >= 2 && son1 - son3 <= 8)
                    {
                         if(son2 - son3 >= 2 && son2 - son3 <= 8)
                         {
                             if(son1 * son2 * son3 == 36)
                             {
                                   System.out.println(son1 + " " + son2 + " " + son3);
                             }
                            
                         }
                    }
               }
//            if(son1 >= son2 + 2 && son1 <= son2 + 8)
//            {
//             if(son1 >= son3 + 2 && son1 <= son3 + 8)
//             {
//              if(son2 >= son1 + 2 && son2 <= son1 + 8)
//              {
//               if(son2 >= son3 + 2 && son2 <= son3 + 8)
//               {
//                if(son3 >= son2 + 2 && son3 <= son2 + 8)
//                {
//                 if(son3 >= son1 + 2 && son3 <= son1 + 8)
//                 {
//                   if(son3 * son2 * son1 == 36)
//                   {
//                       System.out.println(son1 + " " + son2 + " " + son3);
//                   }
//                 }
//                }
//               }
//              }
//             }
//            }
           }
          }
        }
    }
}
