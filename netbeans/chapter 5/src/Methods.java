public class Methods {
    //This method will receive two integers and return their sum
    public int add(int a, int b)
    {
        return a+b;
    }
    //This method will receive three integers and return the smallest 
    public int findSmallest(int a, int b, int c)
    {
      if(a<b && a<c)return a;
    else if (b<a && b<c)return b;
        return c;
    }
    //This method will receive three ints and return the double average of the three
    //rounded to three decimal places
    public double findAverage(int a, int b, int c)
    {
        return((double)(a + b + c) / 3)*1000.0;
    }
    //This method receives an integer and returns the sum of its digits
    public int sumDigits(int num)
    {
         int sum = 0;
    	while (num != 0) {
        	sum += num % 10;
        	num /= 10;
        }
       return sum;
    
    }
    //This method receives and integer year and return true if its a leap year,
    //false if it is not.  Leap years occur every 4 year, except for every 100 years,
    //except those that are divisible by 400.  1900 is not, but 2000 is
    public boolean isLeapYear(int year)
    {
       if (year % 4 == 0) return true;
       if (year % 100 == 0) return false;
       else if(year%400==0)return true;
       return false;
    }
    //This method receives an int and will output the corresponding month as a String
    //Ex:  1 --> "January".  If outside the range of 1 to 12, "Invalid" is returned.
    public String findMonth(int m)
    {
     	String[] months = {"Invalid", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    	if (m >= 1 && m <= 12) {
        	return months[m];
    	}
    	return "Invalid";
	}
    
    //This method will receive two integers.  The method will sum up the range of numbers
    //starting at the smaller number, up to and including the larger number.
    //It should work whether the smaller number is first or second.
    public int sumRange(int a, int b)
    {
       return 0;
    }
    //This method will receive two integers, pointsEarned and pointsPossible.
    //From these a percentage is calculated and the appropriate grade is returned
    // 90-100 is A, 80 to 90 is B, 70 to 80 is C, 60-70 is D, below 60 is E
    public String calculateGrade(int pointsEarned, int pointsPossible)
    {
        double percentage = ((double) pointsEarned / pointsPossible) * 100;
    
        if (percentage >= 90) {
        	return "A";
    	} else if (percentage >= 80) {
        	return "B";
    	} else if (percentage >= 70) {
        	return "C";
    	} else if (percentage >= 60) {
        	return "D";
        }
        	return "E";
    	
	
    }
    //This method will receive an integer n.  The method will return the nth number
    //of the Fibonacci sequence.  The Fibonacci sequence begins 1, 1, 2, 3, 5, 8....
    //Each successive number in the sequence is found by summing the two previous digits.
    //Example:  findNthFibonacci(4) should return 3, since 3 is the 4th number of the sequence
    public int findNthFibonacci(int n)
    {
        if (n == 1 || n == 2) {
    	return 1;
	}
    
	int n1 = 1;
	int n2 = 1;
	int sum = 0;
    
	n = n - 2;
//	while (n != 0) {
//    	sum = n1 + n2;
//    	n1 = n2;
//    	n2 = sum;
//    	n--;
//	}
    
	return sum;
}
	
}


