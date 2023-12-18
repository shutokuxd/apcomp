
public class ArrayManipulation 
{
    public static void main(String[] args) 
    {
        int [] nums = new int [7];
        nums [0] = 3;
        nums [1] = 13;
        nums [2] = 17;
        nums [3] = 7;
        nums [4] = 21;
        nums [5] = 19; 
        nums [6] = 27;
        
//add up all the elements in the array
    int sum =0;
    for (int i = 0; i< nums.length; i++)
    {
        sum = sum + nums[i];
    }
        System.out.println(sum);



//int [] nums2 = {3,13,17,7,21,19,27};
          
    }
}
