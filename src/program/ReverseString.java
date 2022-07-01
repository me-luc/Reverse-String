package program;

public class ReverseString {
	
	public String getReverseString(String text) {
		
		StringBuilder reversedString = new StringBuilder();
		
		for(int i=0; i<text.length(); i++) {
			reversedString.append(text.charAt(text.length() - i - 1));
		}
		
		return reversedString.toString();
	}
	
}
