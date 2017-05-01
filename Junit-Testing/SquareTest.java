package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {
	/*
	 * here we are testing the square method of JunitTesting class.
	 */

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(4);
		assertEquals(16,output);
	}

}

