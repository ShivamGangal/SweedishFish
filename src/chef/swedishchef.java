package chef;
import java.util.ArrayList;
import java.util.Scanner;

public class swedishchef {

	public static void main(String[] args) {
		// Shivam's code
		Scanner in = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();

		for (int k = 0; k < 5; k++) {
			strings.add(" " + in.nextLine());
		}
		System.out.println(strings);

		for (int n = 0; n < strings.size(); n++) { // Changes each string

			String input = strings.get(n);
			input = input.replaceAll("THE", "ZEE");
			// Maggie place your code here
			
			
			// Andrew's Code:
			input = input.replaceAll("O", "U");
			input = input.replaceAll("IR", "UR");
			input = input.replaceAll("TION", "SHUN");
			ArrayList<Integer> posOfSpace = new ArrayList<Integer>();
			for (int i = 0; i < input.length(); i++) { // Finds the indexes of all the spaces
				String match = input.substring(i, i + 1);
				if (match.equals(" ")) {
					posOfSpace.add(i);
				}
			}
			ArrayList<String> oneWord = new ArrayList<String>();
			for (int j = 0; j < posOfSpace.size(); j++) { // Places each word in the array oneWord
				String word;
				if(j < posOfSpace.size() - 1) {
				word = input.substring(posOfSpace.get(j), posOfSpace.get(j + 1));
				}else {
					word = input.substring(posOfSpace.get(j));
				}
				oneWord.add(word);

			}

			for (int k = 0; k < oneWord.size(); k++) { // Makes two substrings, one the first letter and one the rest of
														// the
														// word. Then replaces "EE" for first "I" in the second
														// substring
				String firstLetter = oneWord.get(k).substring(0, 2); // First letter
				String restOfWord = oneWord.get(k).substring(2, oneWord.get(k).length()); // Second letter

				restOfWord = restOfWord.replaceFirst("I", "EE"); // Replaces first "I" with "EE"

				oneWord.set(k, firstLetter + restOfWord);

			}

			input = ""; // Sets input to nothing

			for (int m = 0; m < oneWord.size(); m++) {
				input = input + oneWord.get(m) + " ";
			}
			input = input.substring(1); // Removes the space from the front of the sentence
			//Srujan put your code here:
			
			
			//Saket put your code here:
			
			
			
			input = input + "Bork Bork Bork!";
			System.out.println(input); // FINAL INPUT FOR THIS BLOCk
		}
	}

}

