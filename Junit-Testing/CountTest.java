package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest {
	/*
	 * here we are testing the countA method of JunitTesting class.
	 */

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.countA("java");
		assertEquals(2,output);
	}

}
