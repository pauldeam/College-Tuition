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
		assertEquals(collegeTuition.total(33000, .05));
		assertEquals(collegeTuition.total(18500, .15));
		assertEquals(collegeTuition.total(20000, .03));
		
		assertEquals(collegeTuition.paymentCalculations(58012.5, .1, 120));
		assertEquals(collegeTuition.paymentCalculations(142234.13, .05, 240));
		assertEquals(collegeTuition.paymentCalculations(92377.44, .1, 120));
		assertEquals(collegeTuition.paymentCalculations(83672.54, .1, 360));

		
	}

	private void assertEquals(double total) {
		// TODO Auto-generated method stub
		
	}

}
