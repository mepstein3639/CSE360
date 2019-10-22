package palindrome;

public class Palindrome{
	
	private String testString;

	public Palindrome(String string){
		this.testString = string;
	}
	
    public boolean isPalindrome(){    
    	
    		boolean boo = true;
        int x = 0;
        int y = testString.length() - 1;
        testString = testString.toLowerCase();
        
        while (y > x){
        	
        	char c1 = testString.charAt(x++);
        char c2 = testString.charAt(y--);
            
        	if((c1 >= 'a' && c1 <= 'z') && (c2 >= 'a' && c2 <= 'z')) {
        		if(c1 != c2){
               	boo = false;
            } 
        	} else{
        			if(!(c1 >= 'a' && c1 <= 'z')){
        				x++;
        			}
        		
        			if(!(c2 >= 'a' && c2 <= 'z')) {
        				y--;
        			}
        		}
        }
        return boo;
    } 
} 
  