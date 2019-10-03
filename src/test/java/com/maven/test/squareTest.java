package com.maven.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output =test.square(5);
		assertEquals(25,output);
		App ap = new App();
		int sum = ap.add(2,3);
		assertEquals(5,sum);
	}

}
