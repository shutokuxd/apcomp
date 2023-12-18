
public class SortingArrays 
{
    public static void main(String[] args)
    {
        int[]nums = createArray();
         outputArray(nums);
         sort(nums);
         outputArray(nums);
    }
    public static void sort(int [] n)
    {
//        Bubble sort
//        compare every value to every other value if theyre out of order
        for(int i = 0; i < n.length; i++)
        {
            for(int j = i+1; j < n.length; j++)
            {
                if(n[i] > n[j])
                {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                    
                }
            }
        }
    }
    public static void outputArray(int [] n)
    {
       for(int i = 0; i < n.length; i++)
       {
           System.out.print(n[i] + " ");
       }
        System.out.println("");
    }
    public static int [] createArray()
    {
//        create a size 20 array filled with random values 1 to 100
        int [] nums = new int [20];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = (int)(Math.random()*100)+1;
        }
        return nums;
    }
}
