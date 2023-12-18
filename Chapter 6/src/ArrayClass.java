public class ArrayClass {
        //Return the number of elements in the array.
    public int countElements(int [] n)
    {
        return n.length;
    }
    //Return the largest integer in the array
    public int findLargest(int [] n)
    {
        int best = n[0];
        for(int i = 0; i < n.length; i++)
        {
            if(n[i]>best)best=n[i];
        }
            
      
        return best;
    }
    //Return the number of odd integers in the array
    public int numOdd(int [] n)
    { 
      int counter = 0;   
      for(int i = 0; i < n.length; i++)
      {
          if(n[i]%2!=0 )counter++;
      }
      return counter;
    }
    //Return the number of negative even numbers in the array
    public int countNegEven(int [] n)
     { 
      int counter = 0;   
      for(int i = 0; i < n.length; i++)
      {if(n[i]<0 && n[i]%2==0)counter++;
      }
          
      return counter;
    }
    //Return the index of the first number greater than 90 or -1 if there is none
    public int indexGreater100 (int [] n)  
    {
        for(int i = 0; i < n.length; i++)
        {
            if(n[i]>90)return i;
        }
        return -1;
    }
   // Return true if all values from 1 to 10 appear somewhere in the array, otherwise return false.
    public boolean oneToTenPresent(int [] n)
    {
        int[]count = new int [11];
        for(int i = 0; i < n.length; i++)
        {
            if(n[i] >= 1 && n[i] <= 10)count [     n[i]     ]++;
            
        }
        for(int i=1; i<count.length; i++)
        {
           if(count[i]==0) return false;
        }
        return true;
    }
//This boolean method will return true if there are no repeated values in the array, otherwise 
//false is returned.  Have it output an appropriate message before it returns the value.
     public boolean noRepeats(int [] n)
    {
        for(int i = 0; i < n.length; i++)
        for(int j = 0; j < n.length; j++)
        {
            if(n[i]==n[j]&& i!=j)return false;
        }
        
        return true;
    }
    //This receives the integer array and two additional integers.  The method will swap the values
     //at the two indices provided, unless the indices are outside of the range of valid array indices,
     //in which case nothing is swapped.
    public int[] swap(int [] n, int a, int b)
    {
        if(a < 0 || b < 0 || a > n.length || b > n.length)return n;
        int aswap = n[a];
        int bswap = n[b];
        n[b] = aswap;
        n[a] = bswap;
        return n;
        
       
    }
    //This method will receive an integer n.  The method first build a int array filled with the first 50 numbers
    //in the Fibonacci sequence.  It will then return the value stored at index n-1 in that array.  If n is 
    //greater than 50 or less than 1, a value of -1 should be returned.
    public int findNthFibonacciUsingArrays(int n)
    {
        int [] f = new int [50];
        {
            
        if(n>50 || n<1)return -1;
        
        }
        f[0] = 1;
        f[1] = 1;
        
        for(int i = 2; i<= n; i++){
        f[i]= f[i-1] + f[i-2];
        }
        return f[n-1];
    }
     
}