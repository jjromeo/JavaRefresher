package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionSolver {

	public String[] selectElementsStartingWithA(String[] input) {
		ArrayList<String> aElements = new ArrayList<String> (); 
		for(int i = 0; i < input.length; i++) {
			if (input[i].charAt(0) == 'A' || input[i].charAt(0) == 'a') {
				aElements.add(input[i]);
			}
		}
		String[] output = new String[aElements.size()];
		output = aElements.toArray(output);
		return output;
	}

}
