import java.util.Scanner;

public class PhoneNumberConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//do while loop for repeating user input-
		
		String phrase;
		int phraseLength;
		do {
			System.out.println("Enter a Company Catchphrase phone number ex. 1-800-CAR-LOAN:");
			phrase = input.next();
			
			phraseLength = phrase.length();
			
			//System.out.println(phraseLength);
			
			if(phraseLength > 14) {
				System.out.println("Phrase is longer than 11 digits");
				System.out.println("Would you like to enter another phone number? Enter Yes If not enter a no\n");
				phrase = input.next(); //user should enter an yes or a no
				
				
				
			}
			else{
				System.out.println(wordsToPhoneNum(phrase));
				System.out.println("Would you like to enter another phone number? Enter Yes If not enter a no\n");
				phrase = input.next(); //User should enter an yes or a no
				
				
			}
			
			
			if(phrase.equalsIgnoreCase("no")) {
				System.out.println("Program exitting");
				System.exit(0);
				break;
			}
			
			
			
			
		}while(!phrase.equalsIgnoreCase("no"));
		
		
	
		
	}
///////////////////////////////////////////////////////////

	public static char letterToDigit(char letter) {
		char result = letter;
	switch (letter) {
	
		case 'A': case 'a': case 'B': case 'b':
		case 'C': case 'c': result = '2';
		// ABC,abc = 2
		break;
		
		case 'D': case 'd': case 'E': case 'e':
		case 'F': case 'f': result = '3';
		//DEF,def = 3
		break;
		
		case 'G': case 'g': case 'H': case 'h':
		case 'I': case 'i': result = '4';
		break;
		
		case 'J': case 'j': case 'K': case 'k':
		case 'L': case 'l': result = '5';
		break;
		
		case 'M': case 'm': case 'N': case 'n':
		case 'O': case 'o': result = '6';
		break;
		
		case 'P': case 'p': case 'Q': case 'q':
		case 'R': case 'r': case 'S': case 's':result = '7';
		break;
		
		case 'T': case 't': case 'U': case 'u':
		case 'V': case 'v': result = '8';
		break;
		
		case 'W': case 'w': case 'X': case 'x':
		case 'Y': case 'y': case 'Z': case 'z':result = '9';
		break;
		
		case ' ': result = '0';
		break;
		
		};
		return result;
	}
///////////////////////////////////////////////////////////		
public static String wordsToPhoneNum(String phrase) {
	String result = ""; 
	
	if (check(phrase) == false) {
		result = "\nThis is not an acceptable Phone Number format\n";
		
	}
	else
		for (int i = 0; i < phrase.length(); i++) {
			result = result + letterToDigit(phrase.charAt(i));
			
		}
	
	return result;
	
	}
////////////////////////////////////////////////////////////

public static boolean check(String phrase) {
	
	boolean valid = false;
	
	//String phrase will run through this loop to check if it has: ""
for (int i = 0; i < phrase.length(); i++) {
	char c = phrase.charAt(i);
	if (c == ' ') {	
		valid = true;
	}
	else if (c == '-') {
		valid = true;
	}
	else if ('0' <= c && c <= '9') {
		valid = true;
	}
	else if ('a' <= c && c <= 'z') {
	valid = true;
	}
	else if ('A' <= c && c <= 'Z') {
	valid = true;
	}
	else if (!('0' <= c && c <= '9')) {
		valid = false;
	}
	else if (!('a' <= c && c <= 'z')) {
	valid = false;
	}
	else if (!('A' <= c && c <= 'Z')) {
	valid = false;
	}
	//phrase passes all checks return true

}
//Phrase did not pass one of the check, return false
return valid;
}


///////////////////////////////////////////////


 
}
