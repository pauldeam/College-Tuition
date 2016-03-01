package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		
		MyInteger A = new MyInteger(8);
		MyInteger B = new MyInteger(2);
		MyInteger C = new MyInteger(9);
		
		boolean result = A.isEven();
		assertEquals(true,result);
		
		result = B.isOdd();
		assertEquals(false,result);
		
		result = C.isPrime();
		assertEquals(false,result);
		
	}

}
