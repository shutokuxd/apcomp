
public class UnqiueValues 
{
     public static void main(String[] args) 
     
    {
        int [] nums = new int [10];
        boolean [] picked = new boolean [11];
        for(int i=0; i<nums.length; i++)
         
        {
        int rNum = (int)(Math.random()*10)+1;
            while(picked[rNum]==true)
            {
                rNum = (int)(Math.random()*10)+1;
                
                
            }
            nums [i] = rNum;
            picked[rNum] = true;
           
    }
      for (int i: nums)System.out.println(i);
    }
}
