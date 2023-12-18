
public class MyString {

    public String reverseString(String st) {
        return new StringBuilder(st).reverse().toString();
    }

    public boolean isPalindrome(String st) 
    {
              
        String cleanString = st.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = reverseString(cleanString);
        return cleanString.equals(reversed);

    }

    public String removeBeginningAs(String st) {
        return st.length() > 2 ? st.substring(0, 2).replaceAll("A", "") + st.substring(2) : st.replaceAll("A", "");
    }

    public String makePigLatin(String st)
    {
       return st;
    }

    public boolean areAnagrams(String st1, String st2)
    {
        
    }

    public boolean isHundredDollarWord(String st) {
        int sum = 0;
        for (char c : st.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sum += c - 'A' + 1;
            }
        }
        return sum == 100;
    }
}


public class MyStringEasy {
	
	//This method will simply captialize all the letters in the String
	//Examples:  dog--> DOG,  butter--> BUTTER,  try harder!-->  TRY HARDER!
	public String goBigTime(String st)
	{
		
		
		return st.toUpperCase();
	}
	
	//This method will the number of characters in the string
	//Examples  radar--> 5,    Madam, I'm Adam--> 15,  food-->  4
	public int numChars(String st)
	{
		return st.length();
	}
	
	//User enters a single word String. The
        //program outputs that String with "ski" added
        //at end. However, if the last letter of the
        //inputted String ends in “s”, only add “ki”
        
	//Examples:   thomas--> thomaski, father--> fatherski, nadol--> nadolski
	public String makePolish(String st)
	{
               if(st.charAt(st.length()-1)=='s')return st + "ki";
	       return st + "ski";
	}
	
	//This method will return a String with xX added the the front and Xx added to end.
        //Examples:  Dixon -->  xXDixonXx   Toxic -->  xXToxicXx
	public String makeGamerTag(String st)
	{
		
		return "xX" + st + "Xx" ;
	}
	
	//This boolean method will return true if the received String has either a "u" or "U".  However, if 
        //it contains both a capital and lower case U, they cancel each other out and returns false
	//Examples:  Unicorn --> true   boogers --> false  Ubiquities --> false 
	public boolean containsU(String st)
	{
		return(st.indexOf('u')>=0 && st.indexOf('U')== -1 || st.indexOf('U')>=0 && st.indexOf('u')== -1 );
		
	}
	
	//This boolean method will return true if the String has the same character
        //at the beginning and end of the String.  They don't need to be the same case to return true
        //Examples  Radar --> true      trees --> false     Sassafrass -->  true
	public boolean areBookends(String st)
	{
	 
           return (st.toUpperCase().charAt(st.length()-1) ==  st.toUpperCase().charAt(0));
	}
	
        //This boolean method will return if the String contains consecutive, identical letters
        //Examples  Radar --> false      trees --> true     Llama -->  false
	public boolean hasDoubleLetters(String st)
	{
	       for(int i = 0; i < st.length()-1; i++)
               {
                   
               if(st.charAt(i)== st.charAt(i+1)) return true;
                   
               }
            
              return false;
           
	}
	
        //This method will return the received String with all its vowels removed.
        //Only remove lower case y's at if they are the last character in the String
        //Examples  crypt --> crypt      trees --> trs     Sassafrass -->  Sssfrss  Yeti --> Yt
	public String deleteVowels(String st)
	{
               st = st.replaceAll("([aeiouAEIOU])y\\b", "$1"); 
        return st.replaceAll("[aeiouAEIOU]", ""); 
//                        if (isVowel(st.charAt(i)))
               
	}
        
        //This method will shift all letters three to the right in the alphabet.
        //Make sure x,y and z "wrap" back to beginning of alphabet.  Spaces and non-letter
        //are not shifted.
        //Examples  Bill Dixon --> Eloo Glarq
	
	public String shiftThree(String st) 
        {
     
            char[] charArray = st.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
        char currentChar = charArray[i];

        if (Character.isLetter(currentChar)) {
            char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
            char shiftedChar = (char) ((currentChar - base + 3) % 26 + base);
            charArray[i] = shiftedChar;
        }
    }

    return new String(charArray);
            
        }
        
        //This method will return true if the received String is a palindrome (same forward as backward)
        //In this method, it will be a single word, with no punctuation and all lower case letters
        //Examples  radar--> true,   food-->  false
	public boolean isPalindrome(String st)
	{
	
		 for (int x =0; x < st.length(); x++)
                {
                    if (st.charAt(x)!=st.charAt(st.length()-1-x)) return false;
                }
                return true;
	}
        
         //This method will return true if the received String is a palindrome (same forward as backward)
        //In this method, it will be a phrase, again, the method shoud ignore punctuation and case of letters
        //Examples  Madam, I'm Adam --> true   A toyota --> true    Bill Dixon --> false
	public boolean isPalindromeHard(String st)
	{
	     return false;
        }
  
        
        
       
          public static boolean isVowel(char c)
            {
                return c=='A' || c == 'E' || c=='I' || c=='O' || c=='U'|| c=='a' || c == 'e' || c=='i' || c=='o' || c=='u';
            }
          
      
}


