/**
 * Display String in reverse order word by word
 * Author: Rutuja Pise
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		
		String[] words = input.split(" ");
		String outputString = "";
		for(int i=words.length-1; i>=0; i--) {
			outputString = outputString + words[i] + " ";
		}
		
		return outputString;
	}

}