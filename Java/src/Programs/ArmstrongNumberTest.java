package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClasss;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArmstrongNumberTest {

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
		    public void testIsArmstrong() {
		        assertTrue(ArmstrongNumber.isArmstrong(0));
		        assertTrue(ArmstrongNumber.isArmstrong(1));
		        assertTrue(ArmstrongNumber.isArmstrong(153));
		        assertTrue(ArmstrongNumber.isArmstrong(370));
		        assertTrue(ArmstrongNumber.isArmstrong(371));
		        assertTrue(ArmstrongNumber.isArmstrong(407));

		        assertFalse(ArmstrongNumber.isArmstrong(10));
		        assertFalse(ArmstrongNumber.isArmstrong(100));
		        assertFalse(ArmstrongNumber.isArmstrong(200));
		        assertFalse(ArmstrongNumber.isArmstrong(456));
		        assertFalse(ArmstrongNumber.isArmstrong(999));
		    }
		}
