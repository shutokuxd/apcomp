import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many elements will be in the array?");
		int numElements = s.nextInt();
		int[] nums = makeArray(numElements);
		//nums will only contain the numbers 1 to 10
		int [] f = createFrequencyArray(nums);
		int biggest = mostAppearances(f);//this method should return the largest value within the array
		createHistogram(f, biggest);//This should show how many times each value from 1 to 10 appears in the array.
        
	}
	public static int mostAppearances(int[] freq)
	{
		int biggest = freq[0];
        for(int x = 0; x < freq.length; x++)
        {
            if(freq[x]>biggest)biggest=freq[x];
        }
            return biggest;	
	}
public static int[] makeArray(int num)
{
	int[] nums = new int[num];
	for(int x=0; x < num; x++)
	{
	   nums[x] = (int)(Math.random()*100)+1;
	}
                
	return nums;
}
public static int[] createFrequencyArray(int[] n)
{
	int [] freq = new int[11];
	for(int x = 0; x < n.length; x++)
	{
	  freq[n[x]]++;
	}
	return freq;
}
public static void createHistogram(int[] f, int big)
{
	//This method will output a histogram based on the contents of the freq integer array
    for(int x = big; x >0; x--)
        
	

}
}