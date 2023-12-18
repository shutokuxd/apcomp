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

    public String removeBeginningAs(String st) 
   
 {
        // Check if the string has at least two characters
        if (st.length() < 2) {
            return st;
        }

        // Check if the first two characters are 'a' or 'A'
        if (Character.toLowerCase(st.charAt(0)) == 'a' || Character.toLowerCase(st.charAt(1)) == 'a') {
            // Remove 'a' or 'A' only from the first two characters
            st = (Character.toLowerCase(st.charAt(0)) == 'a' ? "" : String.valueOf(st.charAt(0)))
                    + (Character.toLowerCase(st.charAt(1)) == 'a' ? "" : String.valueOf(st.charAt(1)))
                    + st.substring(2);
        }

        return st;
    }

    
     public String makePigLatin(String st) 
{
        // Convert the input string to lowercase for easier comparison
        st = st.toLowerCase();

        // Check if the word starts with a vowel
        if (startsWithVowel(st)) {
            // Rule 1: If the word starts with a vowel, add "way" to the end
            st = st.substring(0, 1).toUpperCase() + st.substring(1) + "way";
        } else {
            // Rule 2: If the word starts with a consonant or consonant blend, move it to the end and add "ay"
            int firstVowelIndex = findFirstVowelIndex(st);
            String consonantBlend = st.substring(0, firstVowelIndex);
            st = st.substring(firstVowelIndex, firstVowelIndex + 1).toUpperCase() + st.substring(firstVowelIndex + 1) + consonantBlend + "ay";
        }

        return st;
    }

    public boolean areAnagrams(String st1, String st2)
    {
        
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();

        // Check if the lengths of the strings are equal
        if (st1.length() != st2.length()) {
            return false;
        }

        // Count occurrences of each character in both strings
        int[] charCount = new int[26]; // Assuming only lowercase letters, adjust if needed

        // Increment counts for characters in the first string
        for (char ch : st1.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Decrement counts for characters in the second string
        for (char ch : st2.toCharArray()) {
            charCount[ch - 'a']--;
        }

        // Check if all counts are zero, indicating anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
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
  
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    
    private int findVowelIndex(String st) {
        int index = 0;
        while (index < st.length() && !isVowel(st.charAt(index))) {
            index++;
        }
        return index;
    }
          private boolean startsWithVowel(String word) {
        return word.matches("^[aeiou].*");
    }

    private int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        // If no vowel is found, return -1 (not a valid scenario for a single word)
        return -1;
    }

    }
