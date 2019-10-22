package palindrome;
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest{
	
    @Test
    public void nullTest(){
    		Palindrome p = new Palindrome(null);
    		assertTrue(p.isPalindrome());
    }
    
    @Test
    public void spaceTest(){
    		Palindrome p = new Palindrome("So    m a n yd yn   a mo s");
    		assertTrue(p.isPalindrome());
    }
    
    @Test
    public void punctuationTest(){
    		Palindrome p = new Palindrome("Rise to vote sir.");
    		assertTrue(p.isPalindrome());
    }
    
    @Test
    public void numbersTest(){
    		Palindrome p = new Palindrome("945ee7v7ee549");
    		assertTrue(p.isPalindrome());
    }
    
    @Test
    public void regularPalindromeTest() {
    		Palindrome p = new Palindrome("reviver");
    		assertTrue(p.isPalindrome());
    }
}