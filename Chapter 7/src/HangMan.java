
//import static Dictionary.buildDictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HangMan 
{
    public static void main(String[] args) throws Exception 
	{		int miss = 0;
                        int games;
                        boolean [] guessed = new boolean [26];
                        
                        Scanner s = new Scanner (System.in);      
                        String Letters = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
			String[] dictionary = new String[45402];
			dictionary = buildDictionary();
                        games = 1; wins = 0; losses = 0;
//                      String answer = dictionary[(int)Math.random()*45402];
                        System.out.println(" welcome, would you like to play hangman y/n "); 
                        
                        boolean playing = true;
                                
                        while(playing == true)
                        {
                        System.out.println("game #" + games);
                        boolean game = true;
                        char[] answer = dictionary[((int)Math.random()*45402)].toCharArray();
                        char [] Underscore =  buildUnderscore(answer.length);
                        
                        while(game)
                        {
                          System.out.println(Underscore);
                          
                          System.out.println("your guess: ");
                          char guess = s.next().toUpperCase().charAt(0);
                          
                          {
                    
                          while(!Letter(guess))
                          
                          if (guess == '$')System.out.println("unguessed letters: ");
                          showCharacters(Letters, guessed);
                            
                          }
                          
                        System.out.println("invalid character");
                        System.out.print("your guess: ");
                        guess = s.next().toUpperCase().charAt(0);
                        
                        }
//                        char [] characters = answer.toCharArray();
                        
                        
                        
//                      int result = playing(dictionary);
                        
//                        int winP = 0;

                        char c = s.next().toUpperCase().charAt(0);
//                      remove letter if already guessed.
                        Letters = Letters.replace(String.valueOf(c), "");
                        guessed[c-65] = true;
                        while(!Letter(c) || guessed[(int)c-65])
                        {
                            if(c == '$') 
                            {
                                System.out.println("");
                            }
                            else if (c == '*')
                            {
                                System.out.println("wins: " + wins);
                                System.out.println("losses: " + losses);
                                
                            }
                            
                            else if (guessed[(int)c-65])
                            {
                                System.out.println("you have already guessed that letter, try again!");
                            }
                            else if (Letter(c)==false)
                            {
                                System.out.println("invalid character, try again!");
                            }
                              
                        }
                           
                        
                            boolean GameOver = false; 
                            while (GameOver)
                        {
                            games++;
                            System.out.println("game # " + games);
                        }
                        
                        
                        
                       

                        
                        
                        
                       
                      
                       
                        
                        
                            
                  }
        }
    
        static int wins, losses;
    
     public static boolean redo(char a, char[] word, char[] empty, String l, boolean[] g)
     {
            boolean hit = false;
            String s =String.valueOf(a);
            for (int i = 0; i < word.length; i++) {
                if(word[i]==a){
                    empty[i]=a;
                    hit=true;
                }
            }
            if(hit){
                g[(int)a-64]=true;
            }
            l=l.replace(s,"");
            return hit;
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static char[] buildUnderscore(int len)
    {
        
        char[] under  = new char [len];
        
        for (int x =0; x < under.length; x++)
            
            {
                
                under[x]= '_';
                
            }
            
            return under;
    }
    
//    checks if the guess is a letter
    public static boolean Letter(char c )
    {
        return (c<='z' && c>= 'a' || c<='Z' && c>= 'A');
    }
    
    public static void ShowCharacters(String length, boolean[] guess)
    {
        
        
        
    }
    
       public static void showCharacters(String l, boolean[] g){
            for(int x =0; x < l.length(); x++){
                if(!g[x]){
                if(x==l.length()-1) System.out.println(l.charAt(x));
                else System.out.print(l.charAt(x)+" ");
                }
            }
        }
        

//    public static boolean isValid (char c, boolean [] guess)
//    {
//      return((isLetter(c)) && !guess[(int)c-65] || c == '$' || c == '*');
//              
//    }
//    
    
      public static void outputWords(String[] words)
        {
            for (int x =0; x < words.length; x++)
            {
                System.out.println(words[x]);
            }
        }
    
    public static String[] buildDictionary()
	{
		String[] wordList = new String[45402];
		File f = new File("dictionary.txt");
		Scanner input = null;
		int x =0;
		try //try...catch is used when the possibility of an error could result and we want to catch it without causing a runtime error
		{
                    input = new Scanner(f);  	//Scanner is build based on input from the text, not the console
		} 
		catch (FileNotFoundException e) 
		{
                    System.out.println("dictionary.txt file not found");
                    e.printStackTrace();
		}
		while (input.hasNext())
		{
                    String word = input.nextLine().toUpperCase();  //one word appears on each line in the text file
                    wordList[x] = word; 			//add each word into the wordList Array
                    x++;
		}
		input.close();
		System.out.println(wordList.length + " words loaded.");  //outputs the size of the Array built
		return wordList;  
	}
 
        }





//1.******** You will utilize the code and dictionary.txt file from the Dictionary project to populate an array (of String) with a
//random English word. All words should be converted to uppercase.*******
//4.******** The user will be prompted to enter any letter from the alphabet. Non-alphabetic letters will elicit an
//appropriate invalid response and not count as a miss.
//6. ****** The program should not allow the user to guess the same letter more than one time. If they try, the program
//will inform them that they already guessed that letter and it will not count as a miss.


//2. The program will randomly pick one word from the array each time the player plays a game.
//3. To start the program should output one underscore ( _ ) for each letter in the random word selected. Put a
//space between each underscore for the sake of aesthetics. (Ex: _ _ _ _)



//7. If the user guesses a letter that is in the word, all occurrences of that letter are revealed. Obviously, this guess
//will not count as a miss.

//8. If the user guesses a letter that is not in the word, it is counted as a miss. The user is informed of this and the
//total number of misses is displayed.
//9. If seven times the user incorrectly guesses a letter in the word, after the seventh miss, the game is over and they
//lose. The solution is displayed as well.
//10. At any time, the user can input a dollar sign ($) and the program will output the remaining letters of the
//alphabet that the user has not guessed yet.
//11. At any time, the user can input an ampersand (&quot;&amp;&quot;) and the program will allow the user to enter in a guess for
//the solution. If they get it right, the game is over. If they are not right, it counts as a miss.
//12. If they find the solution by guessing all of its letters individually (versus typing in a solution), it counts as a win as
//well and appropriate messages should appear.
//13. Win or lose, the user should be asked if they want to play again and if they do, everything is reset and a new
//random word is chosen from the array and play resumes as before.

//14.***** At any time, the user can type in an asterisk (*) and the program will output their total wins, total losses and win
//percentage with appropriate formatting.