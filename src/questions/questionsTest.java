package questions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class questionsTest {

	@Test
	public void test() {
		QuestionSolver qSolver = new QuestionSolver();
		String[] input = {"bananas", "apples", "pears", "avocados"};
		String[] output = {"apples", "avocados"};
		assertArrayEquals(output, qSolver.selectElementsStartingWithA(input));
	}



}
