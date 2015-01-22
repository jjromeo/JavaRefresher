package questions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class questionsTest {

	private static QuestionSolver qSolver = new QuestionSolver();
	@Test
	public void selectElementsStartingWithA() {
		String[] input = {"bananas", "apples", "pears", "avocados"};
		String[] output = {"apples", "avocados"};
		assertArrayEquals(output, qSolver.selectElementsStartingWithA(input));
	}

	@Test
	public void selectElementsStartingWithVowel() {
		String[] input = {"john", "david", "omar", "fred", "idris", "angela"};
		String[] output = {"omar", "idris", "angela"};
		assertArrayEquals(output, qSolver.selectElementsStartingWithVowel(input));
	}	

	@Test
	public void removeNullsFromArray() {
		Object[] input = new Object[] {'a', 'b', null, null, false, 'c', null};
		Object[] output = {'a', 'b', false, 'c'};
		assertArrayEquals(output, qSolver.removeNullsFromArray(input));
	}
	
	@Test
	public void removeNullsAndFalseFromArray() {
		Object[] input = new Object[] {'a', 'b', null, null, false, 'c', null};
		Character[] output = {'a', 'b', 'c'};
		assertArrayEquals(output, qSolver.removeNullsAndFalseFromArray(input));
	}
}
