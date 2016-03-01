package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CollegeTuition.*;



public class tuition_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		
		
		assertEquals(collegeTuition.total(12500, .1));
		assertEquals(collegeTuition.total(12500, .1));
		assertEquals(collegeTuition.total(12500, .1));
		
		assertEquals(collegeTuition.paymentCalculations(58012.5, .1, 120));
		assertEquals(collegeTuition.paymentCalculations(58012.5, .1, 120));
		assertEquals(collegeTuition.paymentCalculations(58012.5, .1, 120));

		
	}

	private void assertEquals(double total) {
		// TODO Auto-generated method stub
		
	}

}
