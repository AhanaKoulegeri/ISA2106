package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTwoIntegersTest {

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
	public void testSum() {
		
	        AddTwoIntegers adder = new AddTwoIntegers();
	        int result = adder.sum(3, 5);
	        assertEquals(8, result);
	    }
	@Test
    public void testAddWithNegativeNumbers() {
        AddTwoIntegers adder = new AddTwoIntegers();
        int result = adder.sum(-3, -5);
        assertEquals(-8, result);
	}
}


