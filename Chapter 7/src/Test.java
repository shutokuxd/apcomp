/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 703446
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(makePigLatin("string"));
    }
    public static String makePigLatin(String st)
	{
           st = st.toUpperCase();
		if(isVowel(st.charAt(0)) )st= st + "way";
                else 
                {
                    int i = 0;
                    for ( i =0; i < st.length(); i++)
                    {
                        if(isVowel(st.charAt(i)) )break;
                    }
                    System.out.println(i);
                    st = st.substring(i) + st.substring (0, i) + "ay";
                }
//                find where the first vowel is
               
//		for (int i =0; i < st.length(); i++)
                st = st.substring (0,1).toUpperCase() + st.substring(1).toLowerCase();
                return st;
	}
    public static boolean isVowel(char c)
            {
                return c=='A' || c == 'E' || c=='I' || c=='O' || c=='U';
            }
}
