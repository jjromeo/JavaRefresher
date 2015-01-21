package questions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class questionsTest {

	@Test
	public void selectElementsStartingWithA() {
		QuestionSolver qSolver = new QuestionSolver();
		String[] input = {"bananas", "apples", "pears", "avocados"};
		String[] output = {"apples", "avocados"};
		assertArrayEquals(output, qSolver.selectElementsStartingWithA(input));
	}

	@Test
	public void selectElementsStartingWithVowel() {
		QuestionSolver qSolver = new QuestionSolver();
		String[] input = {"john", "david", "omar", "fred", "idris", "angela"};
		String[] output = {"omar", "idris", "angela"};
		assertArrayEquals(output, qSolver.selectElementsStartingWithVowel(input));
	}	


}
