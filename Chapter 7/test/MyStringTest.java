import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringTest {
MyString st = new MyString();

	@Test
	public void testReverseString() {
		assertEquals(st.reverseString("god"), "dog");
		assertEquals(st.reverseString("paris"), "sirap");
		assertEquals(st.reverseString("I love you"), "uoy evol I");
	}
	
	@Test
	public void testIsPalindrome() {
		assertEquals(true, st.isPalindrome("radar"));
		assertEquals(false, st.isPalindrome("hello"));
		assertEquals(true, st.isPalindrome("A man, a plan, a canal, Panama!"));
		assertEquals(true, st.isPalindrome("A toyota"));
		assertEquals(false, st.isPalindrome("Mommy tommy"));
	}

	@Test
	public void testRemoveBeginningAs()
	{
		assertEquals(st.removeBeginningAs("Aardvark"), "rdvark");
		assertEquals(st.removeBeginningAs("Gasoline"), "Gsoline");
		assertEquals(st.removeBeginningAs("Playdough"), "Playdough");
	}
	
	@Test
	public void testMakePigLatin()
	{	
		assertEquals(st.makePigLatin("dixon"), "Ixonday");
		assertEquals(st.makePigLatin("atlas"), "Atlasway");
		assertEquals(st.makePigLatin("string"), "Ingstray");
		assertEquals(st.makePigLatin("crabby"), "Abbycray");
		assertEquals(st.makePigLatin("PRACTICE"), "Acticepray");
	}
	
	@Test
	public void testAreAnagrams()
	{
		assertEquals(true, st.areAnagrams("listen", "silent"));
		assertEquals(false, st.areAnagrams("baseball", "football"));
		assertEquals(false, st.areAnagrams("ball", "lab"));
		assertEquals(true, st.areAnagrams("admirer", "married"));
	}
	
	@Test
	public void testIsHundredDollarWords()
	{
		assertEquals(true, st.isHundredDollarWord("pumpkin"));
		assertEquals(true, st.isHundredDollarWord("printer"));
		assertEquals(false,st.isHundredDollarWord("juniper"));
		assertEquals(false,st.isHundredDollarWord("juniper"));
		assertEquals(false, st.isHundredDollarWord("narcissist"));
	}
	}
